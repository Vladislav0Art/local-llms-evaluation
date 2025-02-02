package com.adobe.epubcheck.tool;

import org.junit.Test;

public class GeneratedTestUnknownArgument {

    @Test
    public void testUnknownArgument() {
        try {
            run("test unknown argument");
            fail("Expected an error");
        } catch (Exception e) {
            // expected
        }
    }

}