package com.adobe.epubcheck.tool;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.spy;

import org.mockito.MockitoAnnotations.initMocks;

public class GeneratedValidateValidFileTest {

    private final EpubChecker epubChecker = new EpubChecker();

    @Test
    public void validateValidFileTest() throws IOException, InvalidVersionException {
        String path = "valid.epub";
        EPUBVersion version = EPUBVersion.VERSION_2;
        Report report = new DefaultReportImpl();
        EPUBProfile profile = EPUBProfile.DEFAULT;

        assertEquals(0, epubChecker.validateFile(path, version, report, profile));
    }

}