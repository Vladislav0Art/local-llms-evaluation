package com.adobe.epubcheck.tool;

public class GeneratedRunWithEmptyArgsMethodRunsTest {

    @Test
    public void runWithEmptyArgsMethodRunsTest() {
        EpubChecker instance = new EpubChecker();
        String[] args = {};
        int result = instance.run(args);
        assertTrue(result >= 0 && result < 1000000);
    }

}