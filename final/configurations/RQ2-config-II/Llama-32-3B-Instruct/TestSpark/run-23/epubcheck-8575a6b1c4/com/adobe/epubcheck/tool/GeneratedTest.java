package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void getLocale_GermanDefault

    Locale() {
        EpubChecker checker = new EpubChecker();
        assertEquals(Locale.GERMAN, checkergetLocale());
    }

    @Test
    public void getLocale_EnUS

    Default Locale() {
        EpubChecker checker = new EpubChecker();
        assertEquals(Locale.EN_US, checker.Locale());
    }

    @Test
    public void run_ValidFile_ReturnsZero() {
        EpubChecker checker = new EpubChecker();
        int result = checker.run(new String[]{});
        assertEquals(0, result);
    }

    @Test
    public void run_InvalidFile_ReturnsNegativeValue() {
        EpubChecker checker = new EpubChecker();
        int result = checker.run(new String[]{"invalid_file"});
        assertTrue(result < 0);
    }

    @Test
    public void processEpubFile_ValidFile_ReturnsZero() {
        @Deprecated
        EpubChecker checker = new EpubChecker();
        int result = checker.processEpubFile(new String[]{});
        assertEquals(0, result);
    }

    @Test
    public void validateFile_ValidFile_ReturnsZero() {
        EpubChecker checker = new EpubChecker();
        int result = checker.validateFile(new File("valid_file"), EPUBVersion.V1_5, new Report(), new EPUBProfile());
        assertEquals(0, result);
    }

    @Test
    public void validateFile_InvalidFile_ReturnsNegativeValue() {
        EpubChecker checker = new EpubChecker();
        int result = checker.validateFile(new File("invalid_file"), EPUBVersion.V1_5, new Report(), new EPUBProfile());
        assertTrue(result < 0);
    }

}