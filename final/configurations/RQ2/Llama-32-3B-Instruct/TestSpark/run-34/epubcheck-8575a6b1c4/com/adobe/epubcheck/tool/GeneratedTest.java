package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import com.adobe.epubcheck.tool.EpubChecker;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilderFactory;

public class GeneratedTest {

    @Test
    public void testGetLocale() {
        EpubChecker epubChecker = new EpubChecker();
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        assertEquals(Locale.US, epubChecker.getLocale(document));
    }

    @Test
    public void testRunEpubFileWithSingleArgument() {
        EpubChecker epubChecker = new EpubChecker();
        File inputFile = new File("input_file.epub");
        File outputFile = new File("output_file.html");
        assertEquals(0, epubChecker.run(inputFile, outputFile));
    }

    @Test
    public void testRunEpubFileWithoutArguments() {
        EpubChecker epubChecker = new EpubChecker();
        File inputFile = new File("input_file.epub");
        File outputFile = new File("output_file.html");
        assertEquals(0, epubChecker.run(inputFile, outputFile));
    }

    @Test
    public void testValidateEpubFile() {
        EpubChecker epubChecker = new EpubChecker();
        File inputFile = new File("input_file.epub");
        Map<String, Object> map = new HashMap<>();
        int result = epubChecker.validate(inputFile, map);
        assertEquals(0, result);
    }

    @Test
    public void testValidateEpubFileWithInvalidVersion() {
        EpubChecker epubChecker = new EpubChecker();
        File inputFile = new File("input_file.epub");
        Map<String, Object> map = new HashMap<>();
        int result = epubChecker.validate(inputFile, map);
        assertEquals(1, result);
    }

    @Test
    public void testValidateEpubFileWithInvalidProfile() {
        EpubChecker epubChecker = new EpubChecker();
        File inputFile = new File("input_file.epub");
        Map<String, Object> map = new HashMap<>();
        int result = epubChecker.validate(inputFile, map);
        assertEquals(1, result);
    }

    @Test
    public void testRunEpubFileWithMultipleArguments() {
        EpubChecker epubChecker = new EpubChecker();
        File inputFile = new File("input_file.epub");
        File outputFile = new File("output_file.html");
        assertEquals(0, epubChecker.run(inputFile, outputFile));
    }

    @Test
    public void testGetLocaleRestrictedVersion() {
        EpubChecker epubChecker = new EpubChecker();
        Locale locale = epubChecker.getLocale();
        assertEquals(Locale.US, locale);
    }

}