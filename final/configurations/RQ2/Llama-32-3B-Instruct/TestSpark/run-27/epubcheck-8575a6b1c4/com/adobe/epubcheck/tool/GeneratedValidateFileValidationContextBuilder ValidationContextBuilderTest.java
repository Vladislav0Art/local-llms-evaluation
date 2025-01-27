package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class GeneratedValidateFileValidationContextBuilder ValidationContextBuilderTest {

    @Test
    public void validateFileValidationContextBuilder

    ValidationContextBuilderTest() throws Exception {
        EpubChecker checker = new EpubChecker();
        ValidationContextBuilder builder = new ValidationContextBuilder(new File("/test.epub").getAbsolutePath());
        int result = checker.validateFile(null, null, builder.build(), EPUBProfile.EPUB2_0);
        assertEquals(1, result);
    }

}