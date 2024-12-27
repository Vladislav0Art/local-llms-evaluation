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

public class GeneratedValidateFileNormalScenarioTest {

    @Test
    public void validateFileNormalScenarioTest() {
        String path = "validPath.epub";
        DummyReport report = new DummyReport();
        EpubChecker checker = new EpubChecker();
        int result = checker.validateFile(path, EPUBVersion.VERSION_3, report);
        assertEquals(0, result);
    }

}