package com.adobe.epubcheck.tool;

public class GeneratedRun_runWithEmptyArray_ThrowsIllegalArgumentException {

    @Test
    public void run_runWithEmptyArray_ThrowsIllegalArgumentException() {
        try {
            int result = EpubCheckerTest.run(new String[0]);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

}