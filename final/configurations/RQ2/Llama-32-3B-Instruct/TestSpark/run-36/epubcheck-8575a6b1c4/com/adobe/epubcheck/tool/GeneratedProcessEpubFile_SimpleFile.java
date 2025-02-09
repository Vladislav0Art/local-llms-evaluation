package com.adobe.epubcheck.tool;

public class GeneratedProcessEpubFile_SimpleFile {

    public static Locale getLocale() {
        return new Locale("en", "US");
    }

    public static int run(String[] args) {
        // implementation
        return 0;
    }

    public static int processEpubFile(String file, String user, String password, String host) {
        // implementation
        return 0;
    }

    public static int validateFile(String path, EPUBVersion version, Report report, String... args) {
        // implementation
        return 0;
    }
}

public class EPUBVersion {
    // fields and methods
}

public class Report {
    // fields and methods
}

public class LocaleTest {

    @Test
    public void processEpubFile_SimpleFile() {
        File file = new File("test.epub");
        int result = EpubChecker instance().processEpubFile(file.toURI().toString(), null, null, null);
        assertNotNull(result);
    }

}