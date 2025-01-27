package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class GeneratedProcessEpubFile DeprecatedProcessEpubFileTest {

    @Test
    public void processEpubFile

    DeprecatedProcessEpubFileTest() {
        EpubChecker checker = new EpubChecker();
        int result = checker.processEpubFile(new String[]{"--output", "test.epub"});
        assertEquals(0, result);
    }

}