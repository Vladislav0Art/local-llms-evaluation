package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EpubCheckFactory;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.DefaultReportImpl;
import com.adobe.epubcheck.util.EPUBVersion;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Locale;

public class GeneratedValidateFileTest {

    @Test
    public void validateFileTest() {
        EpubChecker checker = new EpubChecker();
        Report report = new DefaultReportImpl("test.epub");
        int validationResult = checker.validateFile("test.epub", EPUBVersion.VERSION_2, report, EpubCheckFactory.profileFor("2.0"));
        // check if the returned code states that execution was successful
        Assert.assertTrue(validationResult == 0);
    }

}