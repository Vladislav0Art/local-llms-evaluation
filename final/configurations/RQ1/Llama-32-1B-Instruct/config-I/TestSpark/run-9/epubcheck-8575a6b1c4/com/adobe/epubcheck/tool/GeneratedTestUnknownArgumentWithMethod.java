package com.adobe.epubcheck.tool;

import org.junit.Test;

public class GeneratedTestUnknownArgumentWithMethod {

    @Test
    public void testUnknownArgumentWithMethod() {
        try {
            Main.main(new String[]{"publicMethod", null, "file"});
            fail("Expected Main.main(String[]) to throw an exception");
        } catch (Exception e) {
            assertEquals("Invalid method call in command line argument", e.getMessage());
        }
    }

}