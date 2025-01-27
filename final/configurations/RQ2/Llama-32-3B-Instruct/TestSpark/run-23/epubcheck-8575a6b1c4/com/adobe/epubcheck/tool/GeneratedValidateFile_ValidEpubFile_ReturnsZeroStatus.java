package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;

public class GeneratedValidateFile_ValidEpubFile_ReturnsZeroStatus {

    @Test
    public void validateFile_ValidEpubFile_ReturnsZeroStatus() {
        EpubChecker checker = new EpubChecker();
        int status = checker.validateFile("valid.epub", EPUBVersion.V1_2, new Report(), new EPUBProfile());
        assertEquals(0, status);
    }

}