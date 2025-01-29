package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

public class GeneratedTestValidateFile {

    @Test
    public void testValidateFile() {
        String path = "/test/ebook.epub";
        EPUBVersion version = EPUBVersion.EPUB3_1_4;
        Report report = new DefaultReportImpl();
        EpubCheck checker = new EpubChecker();
        String[] expectedOutput = {null};
        int result = checker.validateFile(path, version, null, expectedOutput);
        assertEquals(0, result); // ignore invalid version
    }

}