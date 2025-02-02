package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedGeneratePublicMethod {

    @Test
    public void generatePublicMethod() {
        String methodName = "myMethod";
        String code = generatePublicMethod(methodName);
        assertTrue(code.contains("#include <string>"));
        assertTrue(code.contains("std::cout <<"));
        assertTrue(code.contains("cout"));
        System.out.println(code);
    }
}

class PublicClassesAndMethods {
    public static String generatePublicClass(String className) {
        return "public class " + className + {\n}"; // Added parentheses to match the method signature
    }

    public static String generatePublicMethod(String methodName) {
        return "public static void myMethod() {\n}" +
                "\tstd::cout << \"Hello, World!\";\n" +
                "}";
    }

}