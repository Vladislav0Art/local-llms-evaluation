package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;

public class GeneratedValidateFile InvalidEpubFile_ReturnsNonZeroStatus {

    @Test
    public void validateFile

    InvalidEpubFile_ReturnsNonZeroStatus() {
        EpubChecker checker = new EpubChecker();
        int status = checker.validateFile("path/to/invalid.epub", EPUBVersion.V1_2, new Report(), new EPUBProfile());
        assertTrue(status > 0);
    }

}