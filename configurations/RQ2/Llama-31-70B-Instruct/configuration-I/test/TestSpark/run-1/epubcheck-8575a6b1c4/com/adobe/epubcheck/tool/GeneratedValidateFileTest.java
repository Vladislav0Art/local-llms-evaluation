package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedValidateFileTest {

    @Test
    public void validateFileTest() {
        EpubChecker epubChecker = new EpubChecker();
        String path = "test.epub";
        EPUBVersion version = EPUBVersion.VERSION_3;
        Report report = mock(Report.class);
        EPUBProfile profile = EPUBProfile.DEFAULT;
        int result = epubChecker.validateFile(path, version, report, profile);
        assertTrue(result >= 0);
    }

}