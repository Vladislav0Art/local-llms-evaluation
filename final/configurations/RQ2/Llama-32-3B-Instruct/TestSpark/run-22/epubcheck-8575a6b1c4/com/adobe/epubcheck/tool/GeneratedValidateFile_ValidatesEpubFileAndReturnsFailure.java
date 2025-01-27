package com.adobe.epubcheck.tool;

public class GeneratedValidateFile_ValidatesEpubFileAndReturnsFailure {

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
    public void validateFile_ValidatesEpubFileAndReturnsFailure() throws Exception {
        File file = new File("test.epub");
        String epubFile = file.toURI().toString();
        EpubVersion epbVersion = EpubChecker.EpubVersion.V3_0;
        int result = EpubChecker.validate(epubFile, epbVersion.name(), new Report(), new EPUBProfile());
        assertFalse(result == 0);
    }
}

public class Report {
    // implementation
}

public class EPUBProfile {
    // implementation
}

}