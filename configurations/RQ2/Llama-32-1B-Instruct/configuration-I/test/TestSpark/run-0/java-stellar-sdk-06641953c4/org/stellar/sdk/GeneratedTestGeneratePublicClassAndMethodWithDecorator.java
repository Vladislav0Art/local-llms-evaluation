package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.*;

import static org.junit.Assert.*;

public class GeneratedTestGeneratePublicClassAndMethodWithDecorator {

    @Test
    public void testGeneratePublicClassAndMethodWithDecorator() throws Exception {
        // Create public class and method with decorator
        Class<?> clazz = new TestClassWithDecorators();
        Method publicMethod = null;

        // Generate the code for public class
        String publicCode = generatePublicClass(clazz);

        // Generate the code for public method
        String publicMethodCode = generatePublicMethod(publicMethod, clazz);

        System.out.println("Generated public code:");
        System.out.println(publicCode);
    }

}