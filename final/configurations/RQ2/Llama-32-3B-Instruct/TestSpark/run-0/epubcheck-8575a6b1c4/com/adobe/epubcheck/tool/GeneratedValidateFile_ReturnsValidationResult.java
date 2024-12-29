package com.adobe.epubcheck.tool;

import java.util.Locale;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class GeneratedValidateFile_ReturnsValidationResult {

    @BeforeClass
    public static void init() {
        // setup
    }

    @Test
    public void validateFile_ReturnsValidationResult() {
        EpubChecker instance = new EpubChecker();
        String path = "path";
        EPUBVersion version = EPUBVersion.V1_0;
        Report report = new Report();
        EPUBProfile profile = new EPUBProfile();
        int result = instance.validateFile(path, version, report, profile);
        assertTrue(result >= 0);
    }
}

class EpubChecker {
    public Locale getLocale() {
        return new Locale("en", "English");
    }

    public int run(String[] args) {
        // implement default arguments
        return 0;
    }

    public int processEpubFile(String[] args) {
        // implement process method
        return 0;
    }

    public int validateFile(String path, EPUBVersion version, Report report, EPUBProfile profile) {
        // implement validation method
        return 0;
    }
}

class EPUBVersion {
    public static final String V1_0 = "v1.0";
}

class Report {
}

}