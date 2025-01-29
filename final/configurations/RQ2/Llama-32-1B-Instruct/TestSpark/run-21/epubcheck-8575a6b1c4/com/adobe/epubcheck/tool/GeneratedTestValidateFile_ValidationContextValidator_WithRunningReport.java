package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestValidateFile_ValidationContextValidator_WithRunningReport {

    @Test
    public void testValidateFile_ValidationContextValidator_WithRunningReport() {
        String[] args = {"-v", "2.1.0", "-e", "https://example.com/ebook.ept", "-o", "/tmp/ebook.ept"};
        EpubChecker check = new EpubChecker();
        RunningReport runningReportMock = Mockito.mock(RunningReport.class);
        try {
            check.validateFile(args[0], null, Mockito.mock(EPUBProfile.class), runningReportMock);
            fail("Expected Report");
        } catch (InvalidVersionException e) {
            // Expect
        }
    }

}