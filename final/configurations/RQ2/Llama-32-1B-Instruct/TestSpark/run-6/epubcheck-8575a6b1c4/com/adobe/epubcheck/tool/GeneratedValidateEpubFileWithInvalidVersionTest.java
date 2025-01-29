package com.adobe.epubcheck.tool;

public class GeneratedValidateEpubFileWithInvalidVersionTest {

    @Test
    public void validateEpubFileWithInvalidVersionTest() {
        String[] args = {"-a", "-d"};
        EpubChecker checker = new EpubChecker();
        // test: "validateEpubFileWithInvalidVersion"
        checkEpubFile(checker, args);
    }

    private int reportCode(Report report) {
        return 0;
    }

}