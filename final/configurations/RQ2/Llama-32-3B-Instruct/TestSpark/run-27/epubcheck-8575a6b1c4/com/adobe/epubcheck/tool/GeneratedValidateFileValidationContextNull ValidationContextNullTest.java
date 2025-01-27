package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class GeneratedValidateFileValidationContextNull ValidationContextNullTest {

    @Test
    public void validateFileValidationContextNull

    ValidationContextNullTest() throws Exception {
        EpubChecker checker = new EpubChecker();
        int result = checker.validateFile(new File("/test.epub").getAbsolutePath(), null, null, EPUBProfile.EPUB2_0);
        assertNotEquals(0, result);
    }

}