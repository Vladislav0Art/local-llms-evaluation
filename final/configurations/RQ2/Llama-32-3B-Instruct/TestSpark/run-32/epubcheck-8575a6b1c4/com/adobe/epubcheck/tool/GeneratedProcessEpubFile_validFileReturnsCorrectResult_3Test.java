package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedProcessEpubFile_validFileReturnsCorrectResult_3Test {

    @Test
    public void processEpubFile_validFileReturnsCorrectResult_3Test() {
        File file = new File("valid_file.epub");
        String[] args = {"--output", "output_file"};
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.processEpubFile(args);
        assertTrue(result == 0);
    }

}