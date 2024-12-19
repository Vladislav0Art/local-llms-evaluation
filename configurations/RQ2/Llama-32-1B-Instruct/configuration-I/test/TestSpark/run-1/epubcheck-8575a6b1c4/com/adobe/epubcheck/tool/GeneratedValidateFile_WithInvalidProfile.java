package com.adobe.epubcheck.tool;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedValidateFile_WithInvalidProfile {

    @Test
    public void validateFile_WithInvalidProfile() {
        String path = "/path/to/file";
        when(ePubChecker.validateFile(path, EPUBVersion.VERSION_1, new Report(), EPUBProfile.NONEXIST)).thenReturn(false);
        boolean result = epubChecker.validateFile(path, EPUBVersion.VERSION_1, new Report(), EPUBProfile.NONEXISTENT);
        assertEquals(false, result);
    }

}