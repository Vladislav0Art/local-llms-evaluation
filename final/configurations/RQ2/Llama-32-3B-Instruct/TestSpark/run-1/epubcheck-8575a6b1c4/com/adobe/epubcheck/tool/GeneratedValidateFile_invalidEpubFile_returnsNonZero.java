package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class GeneratedValidateFile_invalidEpubFile_returnsNonZero {

    @Test
    public void validateFile_invalidEpubFile_returnsNonZero() throws Exception {
        EpubChecker epubChecker = new EpubChecker();
        String path = "test.epub";
        EPUBVersion version = EPUBVersion.v3;
        int result = epubChecker.validateFile(path, version, null, null);
        assertTrue(result != 0);
    }

}