package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.*;

import static org.junit.Assert.*;

public class GeneratedTestGeneratePublicClassAndMethodWithPayloadDecorators {

    @Test
    public void testGeneratePublicClassAndMethodWithPayloadDecorators() throws Exception {
        // Create public class and method with payload decorators
        Class<?> clazz = new TestClassWithPayloadDecorators();
        Method publicMethod = null;

        // Generate the code for public class
        String publicCode = generatePublicClass(clazz);

        // Generate the code for public method
        String publicMethodCode = generatePublicMethod(publicMethod, clazz);

        System.out.println("Generated public code:");
        System.out.println(publicCode);
    }

}