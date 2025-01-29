package com.adobe.epubcheck.tool;

public class GeneratedTest {

    @Test
    public void testGetLocale() {
        Locale locale = EpubChecker.getLocale();
        assertEquals(Locale.ENGLISH, locale);
    }

    @Test
    public void testRun() throws Exception {
        String[] args = {"run", "example.epub"};
        int result = EpubChecker.run(args);
        assertEquals(1, result);

        assertTrue(EpubChecker.validateFile(args));
        assertEquals(true, EpubChecker.validateFile(args));
    }

    @Test
    public void testProcessEpubFile() throws Exception {
        String[] args = {"processEpubFile", "example.epub"};
        EpubChecker.processEpubFile(args);
    }

    @Test
    public void testValidateFile() throws Exception {
        String[] args = {"validateFile", "example.epub", "1.2"};
        EpubChecker.validateFile(args);
        assertEquals(true, EpubChecker.validateFile(args));
    }
}

public class EpubCheck implements EPUBCheck {
    @Override
    public Locale getLocale() {
        return Locale.ENGLISH;
    }

    @Override
    public int run(String... args) throws Exception {
        System.out.println("Running " + args[0]);
        Thread.sleep(1000);
        return 1;
    }

    @Override
    public boolean validateFile(String[] args) throws Exception {
        return true;
    }
}

class EPUBCheckFactory implements EPUBCheckFactory {
    @Override
    public EpubCheck createChecker() {
        return new EpubCheck();
    }

}