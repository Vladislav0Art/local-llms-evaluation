package com.adobe.epubcheck.tool;

public class GeneratedProcessEpubFile_processCommandWithoutArgsFailure {

    private EpubChecker underTest = new EpubChecker();

    @Test
    public void processEpubFile_processCommandWithoutArgsFailure() throws Exception {
        File tmpFile = File.createTempFile("tmp", ".epb");
        String[] args = new String[]{tmpFile.getAbsolutePath(), "--invalid-arg"};
        int result = underTest.processEpubFile(args);
        assertTrue(result != 0);
        tmpFile.delete();
    }

}