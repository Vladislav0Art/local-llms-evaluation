package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestInvalidVersion {

    @Test
    public void testInvalidVersion() {
        boolean result = EpubCheck.main(new String[]{"-version=abc"});
        assertTrue(result);
    }

}