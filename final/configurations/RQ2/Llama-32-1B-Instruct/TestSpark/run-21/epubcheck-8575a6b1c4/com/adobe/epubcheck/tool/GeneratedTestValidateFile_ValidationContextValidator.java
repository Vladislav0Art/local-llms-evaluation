package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestValidateFile_ValidationContextValidator {

    @Test
    public void testValidateFile_ValidationContextValidator() {
        String[] args = {"-v", "2.1.0", "-e", "https://example.com/ebook.ept", "-o", "/tmp/ebook.ept"};
        EpubChecker check = new EpubChecker();
        Validator validator = Mockito.mock(Validator.class);
        try {
            check.validateFile(args[0], null, Mockito.mock(EPUBProfile.class), validator);
            fail("Expected Report");
        } catch (InvalidVersionException e) {
            // Expect
        }
    }

}