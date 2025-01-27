package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class GeneratedTest {

    private final EpubChecker epubChecker = new EpubChecker();

    @Test
    public void getLocale_LocaleIsDefault() {
        Locale locale = epubChecker.getLocale();
        assertEquals(Locale.US, locale);
    }

    @Test
    public void getLocale_LocaleIsOtherThanDefault() {
        Locale locale = Locale.FRANCE;
        epubChecker.setLocale(locale);
        Locale actualLocale = epubChecker.getLocale();
        assertEquals(locale, actualLocale);
    }

    @Test
    public void run_runMethodCallsValidateFile() throws Exception {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintWriter writer = new PrintWriter(outContent);
        String[] args = {"-o", "output"};

        EpubCheckFactory factory = EpubCheckFactory.getFactory();
        Checker checker = factory.createChecker(args, writer);
        epubChecker.run(args);

        assertTrue(outContent.toString().contains("Validation complete"));
    }

    @Test
    public void validateFile_ValidateSuccess() throws Exception {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintWriter writer = new PrintWriter(outContent);
        String[] args = {"-o", "output"};

        EpubCheckFactory factory = EpubCheckFactory.getFactory();
        Checker checker = factory.createChecker(args, writer);

        Map<String, Object> validationContextBuilder = ValidationContextBuilder.getBuilder();
        validationContextBuilder.setOPFProfile("OPF-2.1.0");
        ValidationContext context = validationContextBuilder.build();

        int result = epubChecker.validateFile("path/to/epub/file", EPUBVersion.EPUB3, new DefaultReportImpl(), "profile");
        assertEquals(0, result);
    }

    @Test
    public void validateFile_ValidateFailure() throws Exception {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintWriter writer = new PrintWriter(outContent);
        String[] args = {"-o", "output"};

        EpubCheckFactory factory = EpubCheckFactory.getFactory();
        Checker checker = factory.createChecker(args, writer);

        Map<String, Object> validationContextBuilder = ValidationContextBuilder.getBuilder();
        validationContextBuilder.setOPFProfile("OPF-1.0");
        ValidationContext context = validationContextBuilder.build();

        int result = epubChecker.validateFile("path/to/epub/file", EPUBVersion.EPUB3, new DefaultReportImpl(), "profile");
        assertEquals(1, result);
    }

}