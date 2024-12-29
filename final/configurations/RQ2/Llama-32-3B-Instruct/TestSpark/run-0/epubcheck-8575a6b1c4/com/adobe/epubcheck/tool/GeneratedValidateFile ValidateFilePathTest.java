package com.adobe.epubcheck.tool;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class GeneratedValidateFile ValidateFilePathTest {

    @BeforeClass
    public static void init() {
        // setup
    }

    @Test
    public void validateFile

    ValidateFilePathTest() {
        EpubChecker instance = new EpubChecker();
        int result = instance.validateFile("path", EPUBVersion.V1_0, new Report(), new EPUBProfile());
        assertTrue(result >= 0);
    }

}