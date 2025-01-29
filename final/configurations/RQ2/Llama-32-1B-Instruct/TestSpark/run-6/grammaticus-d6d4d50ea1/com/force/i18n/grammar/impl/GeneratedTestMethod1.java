package com.force.i18n.grammar.impl;

public class GeneratedTestMethod1 {

    public static String helloWorld() {
        return "Hello, World!";
    }

    public static void testMethod1() {
        System.out.println("Test 1");
    }

    public static void testMethod2() {
        System.out.println(helloWorld());
    }
}

@Test
public void testMethod1() {
    Grammaticus.helloWorld();
}

}