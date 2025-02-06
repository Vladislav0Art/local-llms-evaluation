package com.adobe.epubcheck.tool;

public class GeneratedRun_runCommandWithArgSuccess {

    private EpubChecker underTest = new EpubChecker();

    @Test
    public void run_runCommandWithArgSuccess() throws Exception {
        File tmpFile = File.createTempFile("tmp", ".epb");
        String[] args = new String[]{tmpFile.getAbsolutePath(), "--arg"};
        int result = underTest.run(args);
        assertTrue(result == 0);
        assertTrue(tmpFile.delete());
    }

}