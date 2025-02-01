package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EpubCheck;
import com.adobe.epubcheck.messages.MessageDictionary;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.Archive;
import com.adobe.epubcheck.util.DefaultReportImpl;
import com.adobe.epubcheck.util.Report;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.util.Locale;

public class GeneratedValidateFileWithNavModeTest {

    private EpubChecker epubChecker = new EpubChecker();

    @Test
    public void validateFileWithNavModeTest() {
        String mode = "nav";
        Report report = new DefaultReportImpl("sample.epub");
        epubChecker.setLocale(Locale.US);
        int result = epubChecker.validateFile("sample.epub", EpubCheck.EPUBVersion.Version3, report, EpubCheck.EPUBProfile.DEFAULT);

        Assert.assertEquals(0, result);
    }

}