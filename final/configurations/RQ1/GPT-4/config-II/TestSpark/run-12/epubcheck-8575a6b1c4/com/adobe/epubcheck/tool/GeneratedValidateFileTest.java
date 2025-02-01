package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.api.Report;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

public class GeneratedValidateFileTest {

    @Test
    public void validateFileTest() {
        EpubChecker checker = new EpubChecker();
        Report report = new TestReport();
        int result = checker.validateFile("test.epub", null, report, null);
        assertEquals(0, result);
    }

}