package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

public class GeneratedTestValidateFileWithInvalidPath {

    @Test
    public void testValidateFileWithInvalidPath() {
        String[] args = {"--locale", "en-US", "/invalid/path"};
        try {
            EpubChecker checker = new EpubChecker();
            int result = checker.validateFile(null, EPUBVersion .1_4, null, null);
            assertEquals(1, result); // ignore invalid path
        } catch (IOException e) {
        }
    }

}