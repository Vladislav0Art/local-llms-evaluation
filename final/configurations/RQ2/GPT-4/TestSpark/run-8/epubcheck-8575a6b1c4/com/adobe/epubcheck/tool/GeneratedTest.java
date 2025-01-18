package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.EPUBVersion;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Locale;

public class GeneratedTest {

    @Test
    public void getLocaleDefaultTest() {
        EpubChecker epubChecker = new EpubChecker();
        Locale expected = Locale.getDefault();
        Locale result = epubChecker.getLocale();
        Assert.assertEquals("Default locale should be equal to the JVM default locale", expected, result);
    }

    @Test
    public void runEmptyArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        int status = epubChecker.run(new String[]{});
        Assert.assertEquals("Running epub checker with no arguments should return failure status (-1).", -1, status);
    }

    @Test
    public void processEpubFileEmptyArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        int status = epubChecker.processEpubFile(new String[]{});
        Assert.assertEquals("Processing epub file with no arguments should return failure status (-1).", -1, status);
    }

}