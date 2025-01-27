package com.adobe.epubcheck.tool;

public class GeneratedTestProcessEpub {

    @Test
    public void testProcessEpub() {
        EpubChecker checker = new EpubChecker();
        Object result = checker.processEpub();
        assertNotNull(result);
        assertFalse((Boolean) result.equals(0));
    }

}