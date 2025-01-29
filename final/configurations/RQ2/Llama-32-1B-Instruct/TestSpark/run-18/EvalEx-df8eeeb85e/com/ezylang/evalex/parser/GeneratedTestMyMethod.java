package com.ezylang.evalex.parser;

public class GeneratedTestMyMethod {

    public int myMethod() {
        return 1;
    }
}

public class MyClass2 {
    public String myMethod() {
        return "1";
    }

    @Test
    public void testMyMethod() {
        TestFunction func = new TestFunction() {
            @Override
            public Object apply() {
                return MyClass.myMethod();
            }
        };
        System.out.println(func.apply());
    }

}