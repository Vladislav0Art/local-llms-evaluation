package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestValidateFile_OverlayChecker {

    @Test
    public void testValidateFile_OverlayChecker() {
        String[] args = {"-v", "2.1.0", "-e", "https://example.com/ebook.ept", "-o", "/tmp/ebook.ept"};
        EpubChecker check = new EpubChecker();
        OverlayChecker overlayChecker = Mockito.mock(OverlayChecker.class);
        int result = check.validateFile(args[0], null, Mockito.mock(EPUBProfile.class), overlayChecker);
        assertEquals(1, result);
    }

}