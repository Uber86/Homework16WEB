package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/calculator")
@RestController
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping

    public String hello() {
        return "Добро пожаловать в калькулятор.";
    }

    @GetMapping(path = "/plus")
    public String sum(@RequestParam Integer num1, @RequestParam Integer num2) {
        return num1 + " + " + num2 + " = " + calculatorService.sum(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String subtraction(@RequestParam Integer num1, @RequestParam Integer num2) {
        return num1 + " - " + num2 + " = " + calculatorService.subtraction(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String summultiplication(@RequestParam Integer num1, @RequestParam Integer num2) {
        return num1 + " * " + num2 + " = " + calculatorService.multiplication(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam Integer num1, @RequestParam Integer num2) {
        return num1 + " / " + num2 + " = " + calculatorService.divide(num1, num2);
    }

}
