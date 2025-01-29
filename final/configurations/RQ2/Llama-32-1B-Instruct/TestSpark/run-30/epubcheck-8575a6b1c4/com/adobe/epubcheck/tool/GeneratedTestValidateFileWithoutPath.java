package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

public class GeneratedTestValidateFileWithoutPath {

    @Test
    public void testValidateFileWithoutPath() {
        String[] args = {"--locale", "en-US"};
        File file = new File("/test/ebook.epub");
        if (!file.exists()) {
            file.mkdirs();
        }
        EpubChecker checker = new EpubChecker();
        String[] expectedOutput = {"/test/ebook.epub"};
        int result = checker.validateFile(null, EPUBVersion .1_4, null, null);
        assertEquals(0, result); // ignore invalid path
    }

}