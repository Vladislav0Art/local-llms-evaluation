package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedValidateFile_ValidFile_ReturnsZero {

    @Mock
    private EpubCheckFactory epubCheckFactory;

    @Mock
    private LocalizableReport report;

    public Locale getLocale() {
        return Locale.US;
    }

    @Test
    public void validateFile_ValidFile_ReturnsZero() throws Exception {
        EpubChecker epubChecker = new EpubChecker();
        ByteArrayOutputStream outWriter = new ByteArrayOutputStream();
        when(epubCheckFactory.getEpubChecker()).thenReturn(epubChecker);
        when(report.generate(anyString())).thenReturn(outWriter);
        int result = epubChecker.validateFile("test.epub", EPUBVersion.V3_1, report, null);
        assertTrue(result == 0);
    }

}