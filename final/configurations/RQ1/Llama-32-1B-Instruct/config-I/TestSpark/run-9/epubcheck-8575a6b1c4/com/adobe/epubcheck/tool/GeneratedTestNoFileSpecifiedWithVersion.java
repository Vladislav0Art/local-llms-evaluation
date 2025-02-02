package com.adobe.epubcheck.tool;

import org.junit.Test;

public class GeneratedTestNoFileSpecifiedWithVersion {

    @Test
    public void testNoFileSpecifiedWithVersion() {
        try {
            Main.main(new String[]{"version", null, "file"});
            fail("Expected Main.main(String[]) to throw an exception");
        } catch (Exception e) {
            assertEquals("Invalid file specification in command line argument", e.getMessage());
        }
    }

}