package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int sum(int a, int b) {
        return a + b;
    }
    public int subtraction(int a, int b) {
        return a - b;
    }
    public int multiplication(int a, int b) {
        return a * b;
    }
    public int divide(int a, int b) {
        if (a != 0) {
            return a / b;
        } else {
            throw new NullPointerException("На ноль ,маленький мазафакер, делить нельзя");
        }
    }
}
