package com.adobe.epubcheck.tool;

import org.junit.Test;

public class GeneratedTestUnknownArgumentWithPublicVariable {

    @Test
    public void testUnknownArgumentWithPublicVariable() {
        try {
            Main.main(new String[]{"publicVariable", null, "file"});
            fail("Expected Main.main(String[]) to throw an exception");
        } catch (Exception e) {
            assertEquals("Invalid method call in command line argument", e.getMessage());
        }
    }

}