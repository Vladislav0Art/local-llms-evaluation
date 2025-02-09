package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.Messages;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Locale;

public class GeneratedTest {

    @Test
    public void runValidArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {"valid.epub"};
        int result = epubChecker.run(args);
        Assert.assertEquals(0, result);
    }

    @Test
    public void runNoArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {};
        int result = epubChecker.run(args);
        Assert.assertEquals(1, result);
    }

    @Test
    public void getLocaleTest() {
        EpubChecker epubChecker = new EpubChecker();
        Locale expectedLocale = Locale.getDefault();
        Locale actualLocale = epubChecker.getLocale();
        Assert.assertEquals(expectedLocale, actualLocale);
    }

    @Test
    public void processEpubFileValidTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {"valid.epub"};
        int result = epubChecker.processEpubFile(args);
        Assert.assertEquals(0, result);
    }

    @Test
    public void processEpubFileInvalidTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {"invalid.epub"};
        int result = epubChecker.processEpubFile(args);
        Assert.assertEquals(1, result);
    }

    @Test
    public void validateFileTest() {
        EpubChecker epubChecker = new EpubChecker();
        String path = "valid.epub";
        EPUBVersion version = EPUBVersion.VERSION_3;
        Report report = Mockito.mock(Report.class);
        EPUBProfile profile = EPUBProfile.OPF_3_0;

        int result = epubChecker.validateFile(path, version, report, profile);
        Assert.assertEquals(0, result);

        Mockito.verify(report, Mockito.times(1)).setInfo(path, 0, Messages.get("version_detected", version));
        Mockito.verify(report, Mockito.times(1)).initialize();
    }

}