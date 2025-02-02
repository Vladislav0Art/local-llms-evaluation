package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestNoFileSpecified {

    @Test
    public void testNoFileSpecified() {
        boolean result = EpubCheck.main(new String[]{});
        assertTrue(result);
    }

}