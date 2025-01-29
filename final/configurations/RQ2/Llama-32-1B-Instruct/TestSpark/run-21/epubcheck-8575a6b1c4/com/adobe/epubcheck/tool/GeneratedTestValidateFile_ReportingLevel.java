package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestValidateFile_ReportingLevel {

    @Test
    public void testValidateFile_ReportingLevel() {
        String[] args = {"-v", "2.1.0", "-e", "https://example.com/ebook.ept", "-o", "/tmp/ebook.ept"};
        EpubChecker check = new EpubChecker();
        CheckingReport report = Mockito.mock(CheckingReport.class);
        Report reportMock = Mockito.mock(RunningReport.class);
        try {
            check.validateFile(args[0], null, Mockito.mock(EPUBProfile.class), reportMock);
            fail("Expected RunningReport");
        } catch (InvalidVersionException e) {
            // Expect
        }
    }

}