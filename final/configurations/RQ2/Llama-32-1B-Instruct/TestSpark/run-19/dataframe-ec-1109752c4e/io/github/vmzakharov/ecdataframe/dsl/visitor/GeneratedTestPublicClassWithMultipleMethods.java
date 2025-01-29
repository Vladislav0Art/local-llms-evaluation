package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestPublicClassWithMultipleMethods {

    @Test
    public void testPublicClassWithMultipleMethods() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals(5, helloWorld.newMethod(5, 7));
        assertEquals(12, helloWorld.myMethod(5, 7));
    }

    private static class MethodHelper {
        public void myMethod2(HelloWorld helloWorld) {
        }

        public Object method1() {
            return "Hello";
        }
    }

}