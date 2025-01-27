package com.adobe.epubcheck.tool;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class GeneratedValidateFile_ValidReturnsZero {

    @BeforeClass
    public static void init() {
        // Initialize the class under test and any necessary resources.
    }

    @Test
    public void validateFile_ValidReturnsZero() {
        String path = "path";
        EPUBVersion version = new EPUBVersion();
        Report report = new Report();
        EpubChecker checker = new EpubChecker();
        assertEquals(0, checker.validateFile(path, version, report, null));
    }

}