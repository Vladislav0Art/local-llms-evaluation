package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

import org.mockito.Mockito;
import com.adobe.epubcheck.epub.EPUBProfile;
import com.adobe.epubcheck.epub.EPUBVersion;

public class GeneratedValidateFileTest {

    @Test
    public void validateFileTest() {
        EpubChecker checker = new EpubChecker();
        Report report = new Report() {
            @Override
            public void message(String resourceId, int line, int column, String severity, String message) {
            }

            @Override
            public int getErrorCount() {
                return 0;
            }

            @Override
            public int getWarningCount() {
                return 0;
            }

            @Override
            public int getHintCount() {
                return 0;
            }

            @Override
            public void initialize() {
            }

            @Override
            public void finalizeReport() {
            }
        };
        int result = checker.validateFile("path", "version", report, "profile");
        Assert.assertEquals(0, result);
    }

}