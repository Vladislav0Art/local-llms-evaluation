package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestValidateFile_ePubCheck_ValidationContext {

    @Test
    public void testValidateFile_ePubCheck_ValidationContext() {
        String[] args = {"-v", "2.1.0", "-e", "https://example.com/ebook.ept", "-o", "/tmp/ebook.ept"};
        EpubChecker check = new EpubChecker();
        CheckingReport report = Mockito.mock(CheckingReport.class);
        report.setValidationContext(new ValidationContextBuilder().build());
        int result = check.validateFile(args[0], null, Mockito.mock(EPUBProfile.class), report);
        assertEquals(1, result);
    }

}