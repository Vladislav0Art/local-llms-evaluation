package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;

public class GeneratedValidateFileTest {

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