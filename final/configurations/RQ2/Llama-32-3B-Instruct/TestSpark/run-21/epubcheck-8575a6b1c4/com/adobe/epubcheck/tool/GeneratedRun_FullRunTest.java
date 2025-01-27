package com.adobe.epubcheck.tool;

public class GeneratedRun_FullRunTest {

    @Test
    public void run_FullRunTest() throws Exception {
        String[] args = {"--input-file", System.getProperty("user.dir")};
        EpubChecker instance = new EpubChecker();
        int result = instance.run(args);
        assertEquals(0, result);
        assertTrue(new File(System.getProperty("user.dir")).exists());
    }

}