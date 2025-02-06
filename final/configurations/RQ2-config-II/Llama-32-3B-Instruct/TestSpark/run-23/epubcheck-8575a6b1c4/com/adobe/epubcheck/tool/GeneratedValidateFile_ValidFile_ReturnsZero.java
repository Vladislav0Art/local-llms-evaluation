package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class GeneratedValidateFile_ValidFile_ReturnsZero {

    @Test
    public void validateFile_ValidFile_ReturnsZero() {
        EpubChecker checker = new EpubChecker();
        int result = checker.validateFile(new File("valid_file"), EPUBVersion.V1_5, new Report(), new EPUBProfile());
        assertEquals(0, result);
    }

}