package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedValidateFileFailureTest {

    @Test
    public void validateFileFailureTest() {
        EpubChecker checker = new EpubChecker();
        File path = new File("test.epub");
        try {
            checker.validateFile(path.getAbsolutePath(), EPUBVersion.V30, new Report(), new EPUBProfile());
            fail("Expected exception not thrown");
        } catch (Exception e) {
            assertTrue(true); // Expected exception
        }
    }

}