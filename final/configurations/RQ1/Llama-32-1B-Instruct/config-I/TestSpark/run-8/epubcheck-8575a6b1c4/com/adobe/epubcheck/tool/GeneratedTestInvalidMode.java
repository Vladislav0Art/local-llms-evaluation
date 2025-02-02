package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestInvalidMode {

    @Test
    public void testInvalidMode() {
        boolean result = EpubCheck.main(new String[]{"-invalid-mode"});
        assertTrue(result);
    }

}