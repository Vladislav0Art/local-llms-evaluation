package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.*;

import static org.junit.Assert.*;

public class GeneratedTestGeneratePublicClassAndMethod {

    @Test
    public void testGeneratePublicClassAndMethod() throws Exception {
        // Create public class and method
        Class<?> clazz = new TestClass();
        Method publicMethod = null;

        // Generate the code for public class
        String publicCode = generatePublicClass(clazz);

        // Generate the code for public method
        String publicMethodCode = generatePublicMethod(publicMethod, clazz);

        System.out.println("Generated public code:");
        System.out.println(publicCode);
    }

}