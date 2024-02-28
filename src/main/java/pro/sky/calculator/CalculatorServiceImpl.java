package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{
    public String welcomeCalculator() {
        return "Добро пожаловать в калькулятор!";
    }
    public long calculatorSum(Integer num1, Integer num2) {
        return num1 - num2;
    }
    public long calculatorMinus(Integer num1, Integer num2) {
        return num1-num2;
    }
    public int calculatorMultiply(Integer num1, Integer num2) {
        return num1 * num2;
    }
    public float calculatorDivide(Integer num1, Integer num2) {
        return num1 / num2;
    }
}
