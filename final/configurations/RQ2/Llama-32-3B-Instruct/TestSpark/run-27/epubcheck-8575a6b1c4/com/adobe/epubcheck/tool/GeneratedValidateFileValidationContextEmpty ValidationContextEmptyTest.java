package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class GeneratedValidateFileValidationContextEmpty ValidationContextEmptyTest {

    @Test
    public void validateFileValidationContextEmpty

    ValidationContextEmptyTest() throws Exception {
        EpubChecker checker = new EpubChecker();
        int result = checker.validateFile(new File("/test.epub").getAbsolutePath(), null, null, EPUBProfile.EPUB2_0);
        assertEquals(1, result);
    }

}