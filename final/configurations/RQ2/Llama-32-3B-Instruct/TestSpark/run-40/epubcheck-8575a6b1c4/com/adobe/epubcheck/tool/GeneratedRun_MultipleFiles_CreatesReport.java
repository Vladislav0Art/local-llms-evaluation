package com.adobe.epubcheck.tool;

public class GeneratedRun_MultipleFiles_CreatesReport {

    @Test
    public void run_MultipleFiles_CreatesReport() throws Exception {
        File file1 = new File("file1.epub");
        File file2 = new File("file2.epub");

        EpubChecker epubChecker = EpubChecker.getInstance();
        outWriter writer = new outWriter();

        int result1 = epubChecker.run(new String[]{file1.getAbsolutePath(), "-o", "/tmp/file1.html"});
        int result2 = epubChecker.run(new String[]{file2.getAbsolutePath(), "-o", "/tmp/file2.html"});

        assertTrue(result1 > 0);
        assertTrue(result2 > 0);

        CheckingReport report = epubChecker.getReport();
        assertNotNull(report);
    }

}