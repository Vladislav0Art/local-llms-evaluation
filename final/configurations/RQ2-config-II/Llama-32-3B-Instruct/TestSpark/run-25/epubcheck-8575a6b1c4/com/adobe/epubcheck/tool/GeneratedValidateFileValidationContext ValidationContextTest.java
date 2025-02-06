package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedValidateFileValidationContext ValidationContextTest {

    @Test
    public void validateFileValidationContext

    ValidationContextTest() {
        String path = "test.epub";
        EPUBVersion version = EPUBVersion.EPUB3;
        Report report = new DefaultReportImpl();
        EpubChecker checker = new EpubChecker();
        ValidationContext validationContext = new ValidationContextBuilder().build();
        int result = checker.validateFile(path, version, report, null);
        assertNotNull(validationContext);
    }

}