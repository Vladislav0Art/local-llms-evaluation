package net.e175.klaus.solarpositioning;

public class GeneratedTestCalculate {

    public double calculate(double num1, int num2) {
        return (double) (num1 * num2);
    }
}

@Test
public void testCalculate() {
    Calculator calculator = new Calculator();
    double result = calculator.calculate(10, 5);
    assertEquals(45.0, result, 0.01);

    result = calculator.calculate(20, 3);
    assertEquals(60.0, result, 0.01);
}

}