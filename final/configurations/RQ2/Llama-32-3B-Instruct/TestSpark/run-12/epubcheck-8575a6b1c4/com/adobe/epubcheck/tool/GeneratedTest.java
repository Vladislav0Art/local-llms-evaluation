package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

public class GeneratedTest {

    @Test
    public void getLocaleDefault() {
        EpubChecker checker = new EpubChecker();
        Locale locale = checkergetLocale();
        assertEquals(Locale.getDefault(), locale);
    }

    @Test
    public void getLocaleCustom() {
        EpubChecker checker = new EpubChecker();
        Locale locale = new Locale("en", "US");
        checker.setLocale(locale);
        Locale actualLocale = checker.Locale;
        assertEquals(locale, actualLocale);
    }

    @Test
    public void runNoArgs() throws IOException {
        String[] args = {};
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        outWriter writer = new outWriter(outputStream);
        EpubChecker checker = new EpubChecker(writer);
        int result = checker.run(args);
        assertEquals(0, result);
    }

    @Test
    public void runWithArgs() throws IOException {
        String[] args = {"path", "profile"};
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        outWriter writer = new outWriter(outputStream);
        EpubChecker checker = new EpubChecker(writer);
        int result = checker.run(args);
        assertEquals(0, result);
    }

    @Test
    public void validateFileSuccess() throws IOException {
        String path = "path/to/file.epub";
        EPUBVersion version = EPUBVersion.V1;
        Report report = new DefaultReportImpl();
        EPUBProfile profile = new EpubCheckFactory().createProfile();
        int result = EpubChecker.class.newInstance().validateFile(path, version, report, profile);
        assertEquals(0, result);
    }

    @Test
    public void validateFileFailure() throws IOException {
        String path = "path/to/invalid.epub";
        EPUBVersion version = EPUBVersion.V1;
        Report report = new DefaultReportImpl();
        EPUBProfile profile = new EpubCheckFactory().createProfile();
        int result = EpubChecker.class.newInstance().validateFile(path, version, report, profile);
        assertEquals(-1, result);
    }

}