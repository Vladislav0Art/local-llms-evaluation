package com.adobe.epubcheck.tool;

public class GeneratedValidateFile_ValidatesEpubFileAndReturnsSuccess {

    public static int run(String[] args) {
        // implementation
        return 0;
    }

    public static int validate(String epubFile, String epbVersion, Report report, EPUBProfile profile) {
        // implementation
        return 1;
    }

    public static Locale locale() {
        return Locale.getDefault();
    }
}

public class TestEpubChecker {

    @Test
    public void validateFile_ValidatesEpubFileAndReturnsSuccess() throws Exception {
        File file = new File("test.epub");
        String epubFile = file.toURI().toString();
        EpubVersion epbVersion = EpubChecker.EpubVersion.V2_0;
        int result = EpubChecker.validate(epubFile, epbVersion.name(), new Report(), new EPUBProfile());
        assertTrue(result == 0);
    }

}