package com.adobe.epubcheck.tool;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedValidateFile_WithInvalidVersion {

    @Test
    public void validateFile_WithInvalidVersion() {
        String path = "/path/to/file";
        when(ePubChecker.validateFile(path, EPUBVersion.VERSION_2, new Report(), EPUBProfile.NONEXistent)).thenReturn(true);
        boolean result = epubChecker.validateFile(path, EPUBVersion.VERSION_2, new Report(), EPUBProfile.NONEXISTENT);
        assertEquals(true, result);
    }

}