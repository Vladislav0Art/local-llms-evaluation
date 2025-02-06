package com.adobe.epubcheck.tool;

public class GeneratedRun_runWithValidArguments_ReturnsZero {

    @Test
    public void run_runWithValidArguments_ReturnsZero() throws Exception {
        String[] args = {"--epub-version", "1.0"};

        int result = EpubCheckerTest.run(args);
        assertEquals(0, result);
    }

}