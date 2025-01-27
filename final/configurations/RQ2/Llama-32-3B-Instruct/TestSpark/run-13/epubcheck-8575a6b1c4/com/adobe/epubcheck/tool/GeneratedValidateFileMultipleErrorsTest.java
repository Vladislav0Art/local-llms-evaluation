package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedValidateFileMultipleErrorsTest {

    @Test
    public void validateFileMultipleErrorsTest() {
        EpubChecker checker = new EpubChecker();
        File path = new File("test.epub");
        int result = checker.validateFile(path.getAbsolutePath(), EPUBVersion.V30, new Report(), new EPUBProfile());
        assertTrue(result != 0);
    }

}