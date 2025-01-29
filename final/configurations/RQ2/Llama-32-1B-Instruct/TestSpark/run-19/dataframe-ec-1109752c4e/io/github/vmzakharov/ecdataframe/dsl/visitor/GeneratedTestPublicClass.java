package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestPublicClass {

    @Test
    public void testPublicClass() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals(5, helloWorld.newMethod(5, 7));
        System.out.println(helloWorld.fieldValue());
    }

}