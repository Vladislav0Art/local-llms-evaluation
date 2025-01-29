package com.adobe.epubcheck.tool;

public class GeneratedTestValidateFile {

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