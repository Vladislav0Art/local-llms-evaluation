package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.EPUBVersion;
import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.assertEquals;

public class GeneratedGetLocaleDefaultTest {

    @Test
    public void getLocaleDefaultTest() {
        EpubChecker epubChecker = new EpubChecker();
        assertEquals("Should return system locale by default", Locale.getDefault(), epubChecker.getLocale());
    }

}