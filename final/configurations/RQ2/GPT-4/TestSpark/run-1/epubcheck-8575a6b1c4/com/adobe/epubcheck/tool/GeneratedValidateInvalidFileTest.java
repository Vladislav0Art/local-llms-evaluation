package com.adobe.epubcheck.tool;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.spy;

import org.mockito.MockitoAnnotations.initMocks;

public class GeneratedValidateInvalidFileTest {

    private final EpubChecker epubChecker = new EpubChecker();

    @Test
    public void validateInvalidFileTest() throws IOException, InvalidVersionException {
        String path = "valid.epub";
        EPUBVersion version = EPUBVersion.VERSION_2;
        Report report = new DefaultReportImpl();
        EPUBProfile profile = EPUBProfile.DEFAULT;

        when(spyEpubChecker.validateFile(path, version, report, EPUBProfile.INVALID)).thenThrow(new RuntimeException("Invalid EPUB profile"));
        assertEquals(1, spyEpubChecker.validateFile(path, version, report, profile));
    }

}