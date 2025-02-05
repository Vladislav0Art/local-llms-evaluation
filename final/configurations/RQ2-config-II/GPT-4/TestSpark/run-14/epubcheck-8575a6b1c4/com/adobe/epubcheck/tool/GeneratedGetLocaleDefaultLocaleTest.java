package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.EpubCheck;
import com.adobe.epubcheck.api.LocalizableReport;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.FileResourceProvider;
import com.adobe.epubcheck.util.GenericResourceProvider;
import com.adobe.epubcheck.util.TestReportImpl;
import com.adobe.epubcheck.util.URLResourceProvider;
import org.junit.Test;

import java.util.Arrays;
import java.util.Locale;

import org.junit.Assert;

public class GeneratedGetLocaleDefaultLocaleTest {

    @Test
    public void getLocaleDefaultLocaleTest() {
        EpubChecker checker = new EpubChecker();
        Assert.assertEquals("Default locale should be US", Locale.US, checker.getLocale());
    }

}