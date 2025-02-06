package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Locale;

public class GeneratedValidateFile_ValidArgs_ReturnsZero {

    @Test
    public void validateFile_ValidArgs_ReturnsZero() {
        EpubChecker checker = new EpubChecker();
        int result = checker.validateFile(new File("/path/to/file"), EPUBVersion.LATEST, new Report(), new EPUBProfile());
        assertEquals(0, result);
    }

}