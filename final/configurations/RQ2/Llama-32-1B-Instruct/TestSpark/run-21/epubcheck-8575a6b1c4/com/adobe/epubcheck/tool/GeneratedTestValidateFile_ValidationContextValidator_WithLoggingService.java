package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestValidateFile_ValidationContextValidator_WithLoggingService {

    @Test
    public void testValidateFile_ValidationContextValidator_WithLoggingService() {
        String[] args = {"-v", "2.1.0", "-e", "https://example.com/ebook.ept", "-o", "/tmp/ebook.ept"};
        EpubChecker check = new EpubChecker();
        LoggingService loggingServiceMock = Mockito.mock(LoggingService.class);
        try {
            check.validateFile(args[0], null, Mockito.mock(EPUBProfile.class), loggingServiceMock);
            fail("Expected Report");
        } catch (InvalidVersionException e) {
            // Expect
        }
    }

}