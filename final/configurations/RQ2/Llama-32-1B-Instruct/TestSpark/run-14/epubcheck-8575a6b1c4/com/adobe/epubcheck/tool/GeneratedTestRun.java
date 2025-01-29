package com.adobe.epubcheck.tool;

public class GeneratedTestRun {

    @Test
    public void testRun() throws Exception {
        String[] args = {"run", "example.epub"};
        int result = EpubChecker.run(args);
        assertEquals(1, result);

        assertTrue(EpubChecker.validateFile(args));
        assertEquals(true, EpubChecker.validateFile(args));
    }

}