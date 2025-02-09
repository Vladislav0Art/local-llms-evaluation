package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void getLocale_EmptyArgs_ThrowsException() {
        String[] args = new String[0];
        EpubChecker checker = new EpubChecker();
        assertThrows(InvalidVersionException.class, () -> checker.getLocale(args));
    }

    @Test
    public void run_EmptyArgs_ThrowsException() {
        String[] args = new String[0];
        EpubChecker checker = new EpubChecker();
        assertThrows(InvalidVersionException.class, () -> checker.run(args));
    }

    @Test
    public void getLocale_LocalePassed_ReturnsLocale() {
        Locale locale = Locale.FRANCE;
        when(EpubChecker.class.getConstructor().newInstance()).thenReturn(locale);
        String[] args = new String[]{String.valueOf(locale)};
        EpubChecker checker = new EpubChecker();
        assertEquals(locale, checker.getLocale(args));
    }

    @Test
    public void run_EpubFilePassed_ReturnsInt() {
        String epubFile = "test.epub";
        int expectedResult = 0;
        when(EpubChecker.class.getConstructor().newInstance()).thenReturn(expectedResult);
        EpubChecker checker = new EpubChecker();
        assertEquals(expectedResult, checker.run(new String[]{epubFile}));
    }

    @Test
    public void validateFile_ValidFilePassed_ReturnsInt() {
        String path = "test.epub";
        int expectedResult = 0;
        when(EpubChecker.class.getConstructor().newInstance()).thenReturn(expectedResult);
        EpubChecker checker = new EpubChecker();
        assertEquals(expectedResult, checker.validateFile(path, EPUBVersion.V2_0_1, new Report(), new EPUBProfile()));
    }

    @Test
    public void validateFile_InvalidFilePassed_ReturnsInt() {
        String path = "test.invalid.epub";
        int expectedResult = 0;
        when(EpubChecker.class.getConstructor().newInstance()).thenReturn(expectedResult);
        EpubChecker checker = new EpubChecker();
        assertEquals(expectedResult, checker.validateFile(path, EPUBVersion.V2_0_1, new Report(), new EPUBProfile()));
    }

    @Test
    public void validateFile_EpubFilePassed_ValidReport_ReturnsInt() {
        String path = "test.epub";
        int expectedResult = 0;
        Report report = new DefaultReportImpl();
        when(EpubChecker.class.getConstructor().newInstance()).thenReturn(expectedResult);
        EpubChecker checker = new EpubChecker();
        assertEquals(expectedResult, checker.validateFile(path, EPUBVersion.V2_0_1, report, new EPUBProfile()));
    }

    @Test
    public void validateFile_EpubFilePassed_InvalidReport_ReturnsInt() {
        String path = "test.epub";
        int expectedResult = 0;
        Report report = new DefaultReportImpl();
        when(EpubChecker.class.getConstructor().newInstance()).thenReturn(expectedResult);
        EpubChecker checker = new EpubChecker();
        assertEquals(expectedResult, checker.validateFile(path, EPUBVersion.V2_0_1, report, new EPUBProfile()));
    }

}