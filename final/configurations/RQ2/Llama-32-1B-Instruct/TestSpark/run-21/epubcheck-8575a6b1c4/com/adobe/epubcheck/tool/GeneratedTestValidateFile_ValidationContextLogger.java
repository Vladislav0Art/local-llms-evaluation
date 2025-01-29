package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestValidateFile_ValidationContextLogger {

    @Test
    public void testValidateFile_ValidationContextLogger() {
        String[] args = {"-v", "2.1.0", "-e", "https://example.com/ebook.ept", "-o", "/tmp/ebook.ept"};
        EpubChecker check = new EpubChecker();
        LoggingService loggingService = Mockito.mock(LoggingService.class);
        Mockito.when(loggingService.log()).thenReturn(Mockito.anyString());
        int result = check.validateFile(args[0], null, Mockito.mock(EPUBProfile.class), loggingService);
        assertEquals(1, result);
    }

}