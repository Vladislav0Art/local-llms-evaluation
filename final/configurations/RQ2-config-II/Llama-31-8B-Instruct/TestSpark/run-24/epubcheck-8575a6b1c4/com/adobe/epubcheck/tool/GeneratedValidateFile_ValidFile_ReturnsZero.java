package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedValidateFile_ValidFile_ReturnsZero {

    @Test
    public void validateFile_ValidFile_ReturnsZero() {
        EpubChecker checker = new EpubChecker();
        Report report = mock(Report.class);
        EPUBProfile profile = mock(EPUBProfile.class);
        int result = checker.validateFile("path", EPUBVersion.VERSION_2, report, profile);
        assertEquals(0, result);
    }

}