package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.DefaultReportImpl;
import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.assertEquals;

public class GeneratedGetLocale_DefaultLocaleTest {

    @Test
    public void getLocale_DefaultLocaleTest() {
        EpubChecker epubChecker = new EpubChecker();
        Locale expected = Locale.getDefault();
        Locale actual = epubChecker.getLocale();
        assertEquals(expected, actual);
    }

}