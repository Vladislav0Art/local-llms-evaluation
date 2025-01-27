package com.adobe.epubcheck.tool;

public class GeneratedTestRunWithValidArgs {

    @Test
    public void testRunWithValidArgs() throws IOException, Exception {
        String[] args = {"-p", "epub3"};
        int result = EpubChecker(args).run(args);
        assertTrue(result == 0);
    }

}