package com.adobe.epubcheck.tool;

import org.junit.Test;

public class GeneratedTestNoCustomMessageFileSpecified {

    @Test
    public void testNoCustomMessageFileSpecified() {
        try {
            Main.main(new String[]{"-a", "file"});
            fail("Expected Main.main(String[]) to throw an exception");
        } catch (Exception e) {
            assertEquals("Invalid file specification in command line argument", e.getMessage());
        }
    }

}