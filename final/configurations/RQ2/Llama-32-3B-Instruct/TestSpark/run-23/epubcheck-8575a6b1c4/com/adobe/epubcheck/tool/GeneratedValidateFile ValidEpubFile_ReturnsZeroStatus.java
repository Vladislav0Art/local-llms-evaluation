package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;

public class GeneratedValidateFile ValidEpubFile_ReturnsZeroStatus {

    @Test
    public void validateFile

    ValidEpubFile_ReturnsZeroStatus() {
        EpubChecker checker = new EpubChecker();
        int status = checker.validateFile("path/to/valid.epub", EPUBVersion.V1_2, new Report(), new EPUBProfile());
        assertEquals(0, status);
    }

}