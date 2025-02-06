package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class GeneratedValidateFile_InvalidFile_ReturnsNegativeValue {

    @Test
    public void validateFile_InvalidFile_ReturnsNegativeValue() {
        EpubChecker checker = new EpubChecker();
        int result = checker.validateFile(new File("invalid_file"), EPUBVersion.V1_5, new Report(), new EPUBProfile());
        assertTrue(result < 0);
    }

}