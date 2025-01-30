package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.LocalizableReport;
import com.adobe.epubcheck.util.DefaultReportImpl;
import com.adobe.epubcheck.util.EPUBVersion;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Locale;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void runInvalidArgumentsTest() {
        EpubChecker checker = new EpubChecker();

        String[] args = {"invalidArgument"};

        int returnVal = checker.run(args);

        assertEquals(1, returnVal);
    }

    @Test
    public void runNoArgumentsTest() {
        EpubChecker checker = new EpubChecker();

        String[] args = {};

        int returnVal = checker.run(args);

        assertEquals(1, returnVal);
    }

    @Test
    public void runHelpArgumentTest() {
        EpubChecker checker = new EpubChecker();
        final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

        System.setErr(new PrintStream(errContent));

        String[] args = {"--help"};

        int returnVal = checker.run(args);

        assertTrue(errContent.toString().trim().length() == 0);
        assertEquals(0, returnVal);
    }

    @Test
    public void runVersionArgumentTest() {
        EpubChecker checker = new EpubChecker();
        final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

        System.setErr(new PrintStream(errContent));

        String[] args = {"--version"};

        int returnVal = checker.run(args);

        assertTrue(errContent.toString().trim().length() == 0);
        assertEquals(0, returnVal);
    }

    @Test
    public void validateFileWrongURLTest() {
        EpubChecker checker = new EpubChecker();

        ByteArrayOutputStream errContent = new ByteArrayOutputStream();
        System.setErr(new PrintStream(errContent));

        int result = checker.validateFile("http://invalid.url", EPUBVersion.VERSION_3, null, null);

        assertEquals(1, result);
    }

    @Test
    public void getLocaleTest() {
        EpubChecker checker = new EpubChecker();
        Locale result = checker.getLocale();
        assertNotNull(result);
    }

}