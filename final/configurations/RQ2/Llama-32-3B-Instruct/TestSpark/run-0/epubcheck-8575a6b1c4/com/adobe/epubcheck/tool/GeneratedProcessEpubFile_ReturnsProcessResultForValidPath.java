package com.adobe.epubcheck.tool;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class GeneratedProcessEpubFile_ReturnsProcessResultForValidPath {

    @BeforeClass
    public static void init() {
        // setup
    }

    @Test
    public void processEpubFile_ReturnsProcessResultForValidPath() {
        EpubChecker instance = new EpubChecker();
        Map<String, String> map = new HashMap<>();
        map.put("en", "English");
        Locale locale = instance.getLocale();
        assertNotNull(locale);
        assertNotEquals(0, instance.processEpubFile(new String[]{"path"}));
    }

}