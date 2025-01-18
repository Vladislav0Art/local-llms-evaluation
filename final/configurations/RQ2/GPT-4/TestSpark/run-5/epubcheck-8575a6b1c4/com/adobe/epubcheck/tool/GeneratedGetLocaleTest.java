package com.adobe.epubcheck.tool;

import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.util.DefaultReportImpl;
import com.adobe.epubcheck.util.EPUBVersion;

public class GeneratedGetLocaleTest {

    @Test
    public void getLocaleTest() {
        EpubChecker epubChecker = new EpubChecker();
        Locale result = epubChecker.getLocale();
        Assert.assertNotNull(result);
        Assert.assertEquals(Locale.getDefault(), result);
    }

}