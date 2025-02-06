package com.adobe.epubcheck.tool;

public class GeneratedValidateFile_validateWithInvalidArguments_ThrowsNullPointerException {

    @Test
    public void validateFile_validateWithInvalidArguments_ThrowsNullPointerException() {
        try {
            String path = null;
            EPUBVersion version = EPUBVersion.V1;
            Report report = new DefaultReportImpl();
            EPUBProfile profile = new DefaultEPUBProfile();

            int result = EpubCheckerTest.validateFile(path, version, report, profile);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}