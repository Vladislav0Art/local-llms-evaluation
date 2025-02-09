package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import com.adobe.epubcheck.tool.EpubChecker;
import org.w3c.epubcheck.core.Checker;
import org.junit.BeforeClass;

public class GeneratedValidateFile Test_ValidateEpubFileWithInvalidProfile {

    @BeforeClass
    public static void setup() {
        // initialize test data here
    }

    @AfterClass
    public static void tearDown() {
        // clean up test data here
    }

    @Test
    public void validateFile

    Test_ValidateEpubFileWithInvalidProfile() {
        EpubChecker epubChecker = new EpubChecker();
        Map<String, Object> map = new HashMap<>();
        File file = new File("path/to/file.epub");
        int result = epubChecker.validateFile(file.toURI().toString(), "1.0", null, "invalid_profile");
        assertEquals(1, result);
    }

}