package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Locale;

import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.tool.EpubChecker;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetLocaleTest {

    @Mock
    Report report;

    @Test
    public void getLocaleTest() {
        EpubChecker epubChecker = new EpubChecker();
        Locale defaultLocale = Locale.getDefault();
        assertEquals(defaultLocale, epubChecker.getLocale());
    }

}