package com.adobe.epubcheck.opf;

public class GeneratedTestInt {

    public String test() {
        return "test";
    }

    @Override
    public int getPublicMethod(int x) {
        return x + 1;
    }
}

class TestClass1 extends PublicClass {
    public void test() {
        System.out.println("test method");
    }
}

class TestClass2 extends PublicClass {

    @Test
    public void testInt() {
        System.out.println(x + " in TestClass2");
        return Integer.toString(getPublicMethod(5));
    }

    public void testInt() {
        System.out.println("testInt method");
    }
}

public class Main {
    public static void main(String[] args) {
        TestClass1 instance1 = new TestClass1();
        instance1.test();

        TestClass2 instance2 = new TestClass2();
        instance2.testInt();
        instance2.getPublicMethod(10);
    }

}