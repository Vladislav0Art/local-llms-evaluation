package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestPublicMethodReturnsCorrectValue {

    @Test
    public void testPublicMethodReturnsCorrectValue() {
        HelloWorld helloWorld = new HelloWorld();
        int result = helloWorld.myMethod(5, 7);
        assertTrue(result == 12);
    }

    private class HelloWorld {
        public String fieldValue;

        public void newMethod(int x, int y) {
            this.fieldValue = "Hello";
        }

        public int myMethod(int x, int y) {
            return x + y;
        }
    }

}