package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedGeneratePublicClass {

    @Test
    public void generatePublicClass() {
        String className = "MyClass";
        String header = generatePublicClass(className);
        assertTrue(header.contains("public class "));
        assertTrue(header.contains("public"));
        assertTrue(header.contains("static"));
        assertTrue(header.contains("void"));
        System.out.println(header);
    }

}