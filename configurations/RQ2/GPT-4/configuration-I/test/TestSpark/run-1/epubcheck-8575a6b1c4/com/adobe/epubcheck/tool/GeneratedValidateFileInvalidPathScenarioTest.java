package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.EPUBVersion;
import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import static org.mockito.Mockito.*;

import com.adobe.epubcheck.opf.DocumentValidator;
import com.adobe.epubcheck.opf.ValidationContext.ValidationContextBuilder;
import com.adobe.epubcheck.util.EPUBProfile;

public class GeneratedValidateFileInvalidPathScenarioTest {

    @Test
    public void validateFileInvalidPathScenarioTest() {
        String path = "invalidPath.epub";
        DummyReport report = new DummyReport();
        EpubChecker checker = new EpubChecker();
        checker.validateFile(path, EPUBVersion.VERSION_3, report);
    }

    private class DummyReport implements Report {
        @Override
        public void error(String resource, int line, int column, String message) {
        }

        @Override
        public void warning(String resource, int line, int column, String message) {
        }
    }

}