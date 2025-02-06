package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;

public class GeneratedTest {

    @Test
    public void getLocaleTest() {
        EpubChecker checker = new EpubChecker();
        Locale locale = checker.getLocale();
        assertNotNull(locale);
    }

    @Test
    public void runTest() throws Exception {
        String[] args = {"path/to/file"};
        EpubChecker checker = new EpubChecker();
        int result = checker.run(args);
        assertTrue(result >= 0);
    }

    @Test
    public void processEpubFileTest() {
        @SuppressWarnings("UnusedParameters")
        String[] args = {"path/to/file"};
        EpubChecker checker = new EpubChecker();
        int result = checker.processEpubFile(args);
        assertFalse(result < 0);
    }

    @Test
    public void validateFileTest() {
        File file = new File("test_file.epub");
        EpubChecker checker = new EpubChecker();
        Map<String, String> params = new HashMap<>();
        params.put("EPUBVersion", "1.5");
        int result = checker.validateFile(file.getAbsolutePath(), EPUBVersion.valueOf(params.get("EPUBVersion")), null, null);
        assertTrue(result >= 0);
    }

}