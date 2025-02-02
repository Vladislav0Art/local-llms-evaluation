package com.adobe.epubcheck.tool;

import org.junit.Test;

public class GeneratedTestInvalidMode {

    @Test
    public void testInvalidMode() {
        try {
            Main.main(new String[]{"-a", "file", "invalid_mode"});
            fail("Expected Main.main(String[]) to throw an exception");
        } catch (Exception e) {
            assertEquals("Invalid mode in command line argument", e.getMessage());
        }
    }

}