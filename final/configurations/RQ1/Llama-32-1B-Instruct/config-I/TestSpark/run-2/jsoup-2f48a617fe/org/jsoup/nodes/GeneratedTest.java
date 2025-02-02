package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

public class GeneratedTest {

    @Test
    public void test1() {
        String data = "public class PublicClass {\n" +
                "\tpublic static void main(String[] args) {\n" +
                "\t\tSystem.out.println(\"Hello World\");\n" +
                "\t}\n" +
                "}";
        System.out.println(data);
    }

    @Test
    public void test2() {
        String data = "public class TestClass {\n" +
                "\tpublic void publicMethod() {\n" +
                "\t\tSystem.out.println(\"This is a public method\");\n" +
                "\t}\n" +
                "}";
        System.out.println(data);
    }

    @Test
    public void test3() {
        String data = "public class TestClass {\n" +
                "\tpublic void privateMethod() {\n" +
                "\t\tSystem.out.println(\"This is a private method\");\n" +
                "\t}\n" +
                "}";
        System.out.println(data);
    }

    @Test
    public void test4() {
        String data = "public class TestClass {\n" +
                "\tpublic String getMethod() {\n" +
                "\t\treturn \"This is a method with a return type of String\";\n" +
                "\t}\n" +
                "}";
        System.out.println(data);
    }

    @Test
    public void test5() {
        String data = "public class TestClass {\n" +
                "\tpublic int getIntMethod() {\n" +
                "\t\treturn 10;\n" +
                "\t}\n" +
                "}";
        System.out.println(data);
    }

}