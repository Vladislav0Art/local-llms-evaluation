package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;

import org.mockito.Mockito;
import org.junit.runner.RunWith;

public class GeneratedValidateFileWithValidArgsTest {

    @Mock
    private Locale locale;

    @Test
    public void validateFileWithValidArgsTest() {
        String path = "/path/to/file";
        when(locale.toString()).thenReturn("en_US");
        Report report = new Report();
        EPUBProfile profile = new EPUBProfile();
        EpubChecker epubChecker = new EpubChecker();
        assertEquals(0, epubChecker.validateFile(path, "1.0", report, profile));
    }

}