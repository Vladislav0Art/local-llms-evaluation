package com.adobe.epubcheck.tool;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Locale;
import java.io.File;
import java.io.FileNotFoundException;

import org.mockito.Mockito;

public class GeneratedValidateFileValidArgumentsTest {

    @Test
    public void validateFileValidArgumentsTest() {
        EpubChecker checker = new EpubChecker();
        Report report = new DefaultReportImpl("test.epub");
        assertEquals("Expected return status code 0 for a valid EPUB file", 0, checker.validateFile("test.epub", EPUBVersion.VERSION_3, report, EPUBProfile.DEFAULT));
    }

}