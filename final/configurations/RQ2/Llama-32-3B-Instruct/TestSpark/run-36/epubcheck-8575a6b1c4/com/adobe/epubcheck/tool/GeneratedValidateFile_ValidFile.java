package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedValidateFile_ValidFile {

    @Test
    public void validateFile_ValidFile() {
        String path = "path/to/valid/file";
        EPUBVersion version = new EPUBVersion();
        Report report = new Report();
        int result = EpubChecker instance().validateFile(path, version, report, null);
        assertNotNull(result);
    }

}