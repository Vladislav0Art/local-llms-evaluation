package com.adobe.epubcheck.tool;

public class GeneratedTestRunWithoutArguments {

    @Test
    public void testRunWithoutArguments() throws IOException, Exception {
        String[] args = {};
        int result = EpubChecker(args).run(args);
        assertTrue(result >= 0 && result <= 1);
    }

}