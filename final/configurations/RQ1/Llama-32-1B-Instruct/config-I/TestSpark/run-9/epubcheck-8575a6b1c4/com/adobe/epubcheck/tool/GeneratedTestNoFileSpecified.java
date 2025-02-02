package com.adobe.epubcheck.tool;

import org.junit.Test;

public class GeneratedTestNoFileSpecified {

    @Test
    public void testNoFileSpecified() {
        try {
            Main.main(new String[]{"-b"});
            fail("Expected Main.main(String[]) to throw an exception");
        } catch (Exception e) {
            assertEquals("Invalid file specification", e.getMessage());
        }
    }

}