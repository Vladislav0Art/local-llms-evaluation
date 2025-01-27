package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class GeneratedValidateFile ValidateFileTest {

    @Test
    public void validateFile

    ValidateFileTest() throws Exception {
        EpubChecker checker = new EpubChecker();
        Map<String, Object> params = new HashMap<>();
        params.put("version", EPUBVersion.V2_0);
        int result = checker.validateFile(new File("/test.epub").getAbsolutePath(), "EPUB2.0", params.get("version"), params.get("version"));
        assertEquals(0, result);
    }

}