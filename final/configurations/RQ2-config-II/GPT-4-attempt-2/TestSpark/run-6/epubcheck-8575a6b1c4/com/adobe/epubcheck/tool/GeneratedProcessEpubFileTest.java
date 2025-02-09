package com.adobe.epubcheck.tool;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Locale;
import java.io.File;
import java.io.FileNotFoundException;

import org.mockito.Mockito;

public class GeneratedProcessEpubFileTest {

    @Test
    public void processEpubFileTest() {
        EpubChecker checker = new EpubChecker();
        assertEquals("Expected return status code 0 for a valid EPUB file", 0, checker.processEpubFile(new String[]{"test.epub"}));
    }

}