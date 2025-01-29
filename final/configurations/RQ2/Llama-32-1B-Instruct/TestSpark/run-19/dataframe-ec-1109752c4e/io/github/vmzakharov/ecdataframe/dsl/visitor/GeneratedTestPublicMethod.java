package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class GeneratedTestPublicMethod {

    @Test
    public void testPublicMethod() {
        // Create two public methods in "HelloWorld"
        HelloWorld helloWorld = new HelloWorld();

        // Test if calling a private method from the constructor returns correct value.
        assertArrayEquals(new int[]{5, 7}, helloWorld.method1());

        // Test if calling another method that calls the first one works as expected
        MethodHelper helper = new MethodHelper();
        helper.method2(helloWorld);
    }

}