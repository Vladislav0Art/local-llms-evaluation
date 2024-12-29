package com.adobe.epubcheck.tool;

import java.util.Locale;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class GeneratedProcessEpubFile_ReturnsProcessingResult {

    @BeforeClass
    public static void init() {
        // setup
    }

    @Test
    public void processEpubFile_ReturnsProcessingResult() {
        EpubChecker instance = new EpubChecker();
        String[] args = {"path", "version"};
        int result = instance.processEpubFile(args);
        assertTrue(result >= 0);
    }

}