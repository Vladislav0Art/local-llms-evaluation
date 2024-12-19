package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.*;

import static org.junit.Assert.*;

public class GeneratedTestGeneratePrivateClassAndMethodWithDecorator {

    @Test
    public void testGeneratePrivateClassAndMethodWithDecorator() throws Exception {
        // Create private class and method with decorator
        Class<?> clazz = new TestClass();
        Method privateMethod = null;

        // Generate the code for private method
        String privateMethodCode = generatePrivateMethod(privateMethod, clazz);

        System.out.println("Generated private method code:");
        System.out.println(privateMethodCode);
    }

}