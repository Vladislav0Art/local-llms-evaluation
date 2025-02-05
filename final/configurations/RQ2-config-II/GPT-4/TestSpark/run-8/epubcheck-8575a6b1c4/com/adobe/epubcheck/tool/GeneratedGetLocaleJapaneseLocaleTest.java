package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.EpubCheck;
import com.adobe.epubcheck.api.LocalizableReport;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.DefaultReportImpl;
import com.adobe.epubcheck.util.EPUBVersion;
import io.mola.galimatias.URL;
import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedGetLocaleJapaneseLocaleTest {

    @Test
    public void getLocaleJapaneseLocaleTest() {
        EpubChecker epubChecker = new EpubChecker();
        epubChecker.setDefaultLocale(Locale.JAPANESE);
        assertEquals(Locale.JAPANESE, epubChecker.getLocale());
    }

}