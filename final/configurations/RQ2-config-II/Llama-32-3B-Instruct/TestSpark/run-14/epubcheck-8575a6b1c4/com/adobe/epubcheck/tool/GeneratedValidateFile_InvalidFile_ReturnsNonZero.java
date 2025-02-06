package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedValidateFile_InvalidFile_ReturnsNonZero {

    @Mock
    private Checker checker;

    @Mock
    private LocalizableReport report;

    @InjectMocks
    private EpubChecker epubChecker;

    @Test
    public void validateFile_InvalidFile_ReturnsNonZero() {
        String path = "/path/to/invalid/file";
        int result = epubChecker.validateFile(path, EPUBVersion.V3_10_1, report, null);
        assertNotEquals(0, result);
    }

}