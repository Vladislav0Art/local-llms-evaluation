package com.adobe.epubcheck.tool;

public class GeneratedProcessEpubFile_processEpubWithEmptyArray_ThrowsIllegalArgumentException {

    @Test
    public void processEpubFile_processEpubWithEmptyArray_ThrowsIllegalArgumentException() {
        try {
            int result = EpubCheckerTest.processEpubFile(new String[0]);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

}