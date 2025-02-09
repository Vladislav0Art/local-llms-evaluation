package com.adobe.epubcheck.tool;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Locale;

import org.junit.Test;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.EPUBVersion;

public class GeneratedGetLocaleTest {

    @Test
    public void getLocaleTest() {
        EpubChecker checker = new EpubChecker();
        assertNotNull("Locale should not be null", checker.getLocale());
        assertEquals("Default locale should be US", Locale.US, checker.getLocale());
    }

}