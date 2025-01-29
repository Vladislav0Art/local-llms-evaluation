package com.adobe.epubcheck.tool;

import org.junit.Test;

public class GeneratedTestValidFile {

    private String filePath = "path_to_your_file.txt";

    @Test
    public void testValidFile() {
        assertTrue(EpubChecker.validateFile(filePath));
    }

}