package com.adobe.epubcheck.tool;

public class GeneratedTestRun {

    @Test
    public void testRun() throws Exception {
        EpubChecker checker = new EpubChecker();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        checker.run(new String[]{"--locale", "en-US"}, outContent);
        PrintWriter pw = new PrintWriter(outContent);
        assertTrue(pw.toString().contains("EpubChecker"));
    }

}