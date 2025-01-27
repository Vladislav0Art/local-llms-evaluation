package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Locale;

public class GeneratedValidateFile_validateWithValidArgs_test {

    @Test
    public void validateFile_validateWithValidArgs_test() {
        String path = "path/to/file.epub";
        EPUBVersion version = EPUBVersion.EPUB3;
        Report report = new DefaultReportImpl();
        EpubChecker checker = new EpubChecker();
        int result = checker.validateFile(path, version, report, null);
        assertTrue(result == 0);
    }

}