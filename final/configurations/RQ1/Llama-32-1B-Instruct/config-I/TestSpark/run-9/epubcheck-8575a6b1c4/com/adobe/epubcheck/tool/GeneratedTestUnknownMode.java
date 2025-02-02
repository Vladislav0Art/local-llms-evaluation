package com.adobe.epubcheck.tool;

import org.junit.Test;

public class GeneratedTestUnknownMode {

    @Test
    public void testUnknownMode() {
        try {
            Main.main(new String[]{"mode", null, "file"});
            fail("Expected Main.main(String[]) to throw an exception");
        } catch (Exception e) {
            assertEquals("Invalid mode in command line argument", e.getMessage());
        }
    }

}