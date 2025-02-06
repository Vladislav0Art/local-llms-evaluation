package com.adobe.epubcheck.tool;

public class GeneratedRun_runCommandWithArgFailure {

    private EpubChecker underTest = new EpubChecker();

    @Test
    public void run_runCommandWithArgFailure() throws Exception {
        File tmpFile = File.createTempFile("tmp", ".epub");
        String[] args = new String[]{tmpFile.getAbsolutePath(), "--invalid-arg"};
        int result = underTest.run(args);
        assertTrue(result != 0);
        assertTrue(tmpFile.delete());
    }

}