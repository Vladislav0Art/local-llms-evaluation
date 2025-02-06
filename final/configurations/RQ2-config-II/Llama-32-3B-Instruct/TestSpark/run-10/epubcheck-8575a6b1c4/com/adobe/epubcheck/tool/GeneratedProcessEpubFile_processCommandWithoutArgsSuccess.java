package com.adobe.epubcheck.tool;

public class GeneratedProcessEpubFile_processCommandWithoutArgsSuccess {

    private EpubChecker underTest = new EpubChecker();

    @Test
    public void processEpubFile_processCommandWithoutArgsSuccess() throws Exception {
        File tmpFile = File.createTempFile("tmp", ".epub");
        String[] args = new String[]{tmpFile.getAbsolutePath()};
        int result = underTest.processEpubFile(args);
        assertTrue(result == 0);
        tmpFile.delete();
    }

}