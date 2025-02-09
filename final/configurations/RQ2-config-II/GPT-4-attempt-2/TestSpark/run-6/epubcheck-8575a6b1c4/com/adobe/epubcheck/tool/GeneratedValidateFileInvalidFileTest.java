package com.adobe.epubcheck.tool;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Locale;
import java.io.File;
import java.io.FileNotFoundException;

import org.mockito.Mockito;

public class GeneratedValidateFileInvalidFileTest {

    @Test
    public void validateFileInvalidFileTest() {
        EpubChecker checker = new EpubChecker();
        Report report = new DefaultReportImpl("nonexistent.epub");
        assertEquals("Expected return status code 1 for a nonexistent EPUB file", 1, checker.validateFile("nonexistent.epub", EPUBVersion.VERSION_3, report, EPUBProfile.DEFAULT));
    }

}