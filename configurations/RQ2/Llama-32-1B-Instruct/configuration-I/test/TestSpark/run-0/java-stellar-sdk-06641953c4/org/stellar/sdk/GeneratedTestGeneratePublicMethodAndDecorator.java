package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.*;

import static org.junit.Assert.*;

public class GeneratedTestGeneratePublicMethodAndDecorator {

    @Test
    public void testGeneratePublicMethodAndDecorator() throws Exception {
        // Create public class and method with decorator
        Class<?> clazz = new TestClassWithDecorators();
        Method publicMethod = null;

        // Generate the code for public method
        String publicMethodCode = generatePublicMethod(publicMethod, clazz);

        System.out.println("Generated public method code:");
        System.out.println(publicMethodCode);
    }

}