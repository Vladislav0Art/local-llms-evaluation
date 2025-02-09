package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RunWith(JUnit4.class)
public class GeneratedValidateFile_InvalidEpubFileReturnsNonZero {

    @Test
    public void validateFile_InvalidEpubFileReturnsNonZero() throws Exception {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        try (PrintWriter pw = new PrintWriter(outContent)) {
            EpubChecker epubChecker = new EpubChecker();
            int result = epubChecker.validateFile(new File("invalid.epub"), EPUBVersion.EPUB2, new Report(), new EPUBProfile());
            assertTrue(result > 0);
        }
    }

}