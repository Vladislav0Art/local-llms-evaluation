package com.adobe.epubcheck.tool;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.DefaultReportImpl;
import com.adobe.epubcheck.util.EPUBVersion;

public class GeneratedGetLocaleDefaultLocaleTest {

    @Test
    public void getLocaleDefaultLocaleTest() {
        EpubChecker epubChecker = new EpubChecker();
        assertNotNull("Locale should not be null.", epubChecker.getLocale());
    }

}