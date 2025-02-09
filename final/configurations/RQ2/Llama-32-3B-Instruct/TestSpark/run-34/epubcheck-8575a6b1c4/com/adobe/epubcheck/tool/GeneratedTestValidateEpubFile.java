package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import com.adobe.epubcheck.tool.EpubChecker;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilderFactory;

public class GeneratedTestValidateEpubFile {

    @Test
    public void testValidateEpubFile() {
        EpubChecker epubChecker = new EpubChecker();
        File inputFile = new File("input_file.epub");
        Map<String, Object> map = new HashMap<>();
        int result = epubChecker.validate(inputFile, map);
        assertEquals(0, result);
    }

}