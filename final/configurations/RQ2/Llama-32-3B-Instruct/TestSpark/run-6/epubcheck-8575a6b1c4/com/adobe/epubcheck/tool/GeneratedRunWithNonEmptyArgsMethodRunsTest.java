package com.adobe.epubcheck.tool;

public class GeneratedRunWithNonEmptyArgsMethodRunsTest {

    @Test
    public void runWithNonEmptyArgsMethodRunsTest() {
        EpubChecker instance = new EpubChecker();
        String[] args = {"arg1", "arg2"};
        int result = instance.run(args);
        assertTrue(result >= 0 && result < 1000000);
    }

}