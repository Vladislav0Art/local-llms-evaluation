package com.adobe.epubcheck.tool;

public class GeneratedValidateFile_validateWithValidArguments_ReturnsZero {

    @Test
    public void validateFile_validateWithValidArguments_ReturnsZero() throws Exception {
        String path = "/path/to/epub/file.epub";
        EPUBVersion version = EPUBVersion.V1;
        Report report = new DefaultReportImpl();
        EPUBProfile profile = new DefaultEPUBProfile();

        int result = EpubCheckerTest.validateFile(path, version, report, profile);
        assertEquals(0, result);
    }

}