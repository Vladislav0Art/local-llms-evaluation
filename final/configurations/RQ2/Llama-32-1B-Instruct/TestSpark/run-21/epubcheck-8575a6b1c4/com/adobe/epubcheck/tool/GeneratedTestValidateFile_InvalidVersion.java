package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestValidateFile_InvalidVersion {

    @Test
    public void testValidateFile_InvalidVersion() {
        String[] args = {"-v", "2.1.0", "-e", "https://example.com/ebook.ept", "-o", "/tmp/ebook.ept"};
        EpubCheck check = new EpubChecker();
        try {
            check.validateFile(args[0], null, Mockito.mock(EPUBProfile.class), Mockito.mock(EPUBVersion.class));
            fail("Expected InvalidVersionException");
        } catch (InvalidVersionException e) {
            // Expect
        }
    }

}