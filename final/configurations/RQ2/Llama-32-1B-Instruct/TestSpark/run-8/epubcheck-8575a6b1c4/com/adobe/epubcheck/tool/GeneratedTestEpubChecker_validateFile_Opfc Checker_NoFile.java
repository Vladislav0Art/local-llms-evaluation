package com.adobe.epubcheck.tool;

public class GeneratedTestEpubChecker_validateFile_Opfc Checker_NoFile {

    @Test
    public void testEpubChecker_validateFile_Opfc

    Checker_NoFile() {
        File file = new File("");
        EpubChecker checker = new EpubChecker();
        try {
            checker.validateFile(file, "current", EPUBProfile.SANDBOX, null);
            Assertions.fail("Expected FileNotFoundException");
        } catch (FileNotFoundException e) {
            // Expected
        }
    }

}