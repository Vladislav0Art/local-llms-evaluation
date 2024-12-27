package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.epub.EPUBProfile;
import com.adobe.epubcheck.epub.EPUBVersion;
import com.adobe.epubcheck.tool.EpubChecker;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Locale;

public class GeneratedValidateFileValidTest {

    @Test
    public void validateFileValidTest() {
        EpubChecker checker = new EpubChecker();
        Report report = Mockito.mock(Report.class);
        int result = checker.validateFile("validFilePath", EPUBVersion.VERSION_2_0, report, EPUBProfile.DEFAULT);
        Assert.assertEquals(0, result);
    }

}