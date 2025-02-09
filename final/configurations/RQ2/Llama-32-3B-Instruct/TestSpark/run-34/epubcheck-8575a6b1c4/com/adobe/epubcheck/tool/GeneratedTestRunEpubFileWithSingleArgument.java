package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import com.adobe.epubcheck.tool.EpubChecker;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilderFactory;

public class GeneratedTestRunEpubFileWithSingleArgument {

    @Test
    public void testRunEpubFileWithSingleArgument() {
        EpubChecker epubChecker = new EpubChecker();
        File inputFile = new File("input_file.epub");
        File outputFile = new File("output_file.html");
        assertEquals(0, epubChecker.run(inputFile, outputFile));
    }

}