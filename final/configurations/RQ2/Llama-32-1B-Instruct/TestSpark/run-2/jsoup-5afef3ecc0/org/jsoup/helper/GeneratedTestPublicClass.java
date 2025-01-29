package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestPublicClass {

    @PublicClass
    private static void publicMethod() {
        System.out.println("Hello World");
    }

    @PublicMethod
    public static int publicMethodInt(int a, int b) {
        return a + b;
    }
}

class GeneratedTest {

    @Test
    public void testPublicClass() {
        Example.publicMethod();
    }

}