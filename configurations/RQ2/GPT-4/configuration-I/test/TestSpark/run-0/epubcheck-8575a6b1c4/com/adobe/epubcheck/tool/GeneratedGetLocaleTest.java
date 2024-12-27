package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

import org.mockito.Mockito;
import com.adobe.epubcheck.epub.EPUBProfile;
import com.adobe.epubcheck.epub.EPUBVersion;

public class GeneratedGetLocaleTest {

    @Test
    public void getLocaleTest() {
        EpubChecker checker = new EpubChecker();
        Locale locale = checker.getLocale();
        Assert.assertNotNull(locale);
    }

}