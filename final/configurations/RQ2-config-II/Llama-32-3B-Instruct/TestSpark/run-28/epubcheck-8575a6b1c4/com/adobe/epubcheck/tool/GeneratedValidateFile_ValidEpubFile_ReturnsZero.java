package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;

public class GeneratedValidateFile_ValidEpubFile_ReturnsZero {

    @Test
    public void validateFile_ValidEpubFile_ReturnsZero() {
        EpubCheck check = new EpubCheck();
        int result = check.validateFile(new File("valid.epub").getPath(), EPUBVersion.EPUB30);
        assertEquals(0, result);
    }

}