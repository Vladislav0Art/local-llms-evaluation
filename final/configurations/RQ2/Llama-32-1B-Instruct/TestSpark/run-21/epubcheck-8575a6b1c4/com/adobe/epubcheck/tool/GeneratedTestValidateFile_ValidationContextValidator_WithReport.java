package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestValidateFile_ValidationContextValidator_WithReport {

    @Test
    public void testValidateFile_ValidationContextValidator_WithReport() {
        String[] args = {"-v", "2.1.0", "-e", "https://example.com/ebook.ept", "-o", "/tmp/ebook.ept"};
        EpubChecker check = new EpubChecker();
        Report reportMock = Mockito.mock(Report.class);
        try {
            check.validateFile(args[0], null, Mockito.mock(EPUBProfile.class), reportMock);
            fail("Expected Report");
        } catch (InvalidVersionException e) {
            // Expect
        }
    }

}