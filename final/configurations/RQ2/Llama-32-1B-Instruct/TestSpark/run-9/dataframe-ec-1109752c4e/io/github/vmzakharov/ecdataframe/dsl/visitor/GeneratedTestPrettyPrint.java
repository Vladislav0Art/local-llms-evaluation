package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestPrettyPrint {

    @Override
    public boolean visit(StringBuilder sb) {
        System.out.println("String: " + sb.toString());
        return true;
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

class Printer {
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

    @Test
    public void testPrettyPrint() {
        PrettyPrintVisitorImpl visitor = new PrettyPrintVisitorImpl();
        Printer printer = new Printer();

        StringBuilder sb = new StringBuilder("Hello, world!");
        visitor.visit(sb);

        Integer integer = 123;
        visitor.visit(integer);

        Boolean booleanValue = true;
        visitor.visit(booleanValue);

        System.out.println(printer.printInt(456));
        System.out.println(printer.printBool(false));

        TestSpark testSpark = new TestSpark();
    }

}