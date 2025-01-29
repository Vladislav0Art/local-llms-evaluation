package org.jsoup.nodes;

public class GeneratedTest {

    public int calculateSum(String[] numbers) {
        return 0;
    }

    public double calculateMean(double[] numbers) {
        int sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    public double calculateProduct(String[] numbers) {
        double product = 1;
        for (String number : numbers) {
            product *= Double.parseDouble(number);
        }
        return product;
    }

    public int calculatePower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * calculatePower(base, exponent - 1);
        }
    }
}

public class CalculatorTest {

}