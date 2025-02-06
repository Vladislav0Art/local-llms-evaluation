package com.adobe.epubcheck.tool;

public class GeneratedRun_runCommandWithoutArgsSuccess {

    private EpubChecker underTest = new EpubChecker();

    @Test
    public void run_runCommandWithoutArgsSuccess() throws Exception {
        File tmpFile = File.createTempFile("tmp", ".epub");
        String[] args = new String[]{tmpFile.getAbsolutePath()};
        int result = underTest.run(args);
        assertTrue(result == 0);
        assertTrue(tmpFile.delete());
    }

}