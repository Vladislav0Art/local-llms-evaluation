package com.adobe.epubcheck.tool;

public class GeneratedRun_runWithValidArgumentsAndWriteToOutput_ReturnsZero {

    @Test
    public void run_runWithValidArgumentsAndWriteToOutput_ReturnsZero() throws Exception {
        String[] args = {"--epub-version", "1.0"};

        int result = EpubCheckerTest.run(args);
        assertTrue(result == 0 || System.getProperty("output") != null);
    }

}