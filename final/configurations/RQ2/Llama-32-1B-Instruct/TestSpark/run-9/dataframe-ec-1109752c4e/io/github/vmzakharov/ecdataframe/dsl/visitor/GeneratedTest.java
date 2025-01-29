package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTest {

    private String[][] data;

    public void print(String string) {
        System.out.println("DataFrame: " + string);
    }

    public void printInt(Integer integer) {
        System.out.println("DataFrameInt: " + integer);
    }

    public void printBool(Boolean booleanValue) {
        System.out.println("DataFrameBool: " + (booleanValue.equals(true) ? "True" : "False"));
    }
}

public class PrettyPrintVisitorImpl implements PrettyPrintVisitor<DataFrame> {

    @Override
    public boolean visit(DataFrame df) {
        StringBuilder sb = new StringBuilder();
        for (String[] row : df.data) {
            for (String cell : row) {
                if (cell != null && !cell.equals("")) {
                    sb.append(cell).append(" ");
                }
            }
            sb.deleteCharAt(sb.length() - 1); // remove trailing space
            System.out.println("DataFrame: " + sb.toString());
        }
        return true;
    }

    @Override
    public void visit(StringBuilder sb) {
        System.out.println("String: " + sb.toString());
    }

    @Override
    public void visit(Integer integer) {
        System.out.println("Integer: " + integer);
    }

    @Override
    public void visit(Boolean booleanValue) {
        System.out.println("Boolean: " + (booleanValue.equals(true) ? "True" : "False"));
    }
}

public class Printer {

    public String print(String string) {
        return "Printed: " + string;
    }

    public String printInt(Integer integer) {
        return "Printed Integer: " + integer;
    }

    public String printBool(Boolean booleanValue) {
        return "Printed Boolean: " + (booleanValue.equals(true) ? "True" : "False");
    }
}

public class TestSpark {

}