package com.adobe.epubcheck.tool;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.io.File;
import java.util.Locale;

import org.junit.Test;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.EPUBVersion;

public class GeneratedGetLocaleTest {

    @Test
    public void getLocaleTest() {
        EpubChecker epubChecker = new EpubChecker();
        Locale expectedLocale = Locale.getDefault();
        assertEquals(expectedLocale, epubChecker.getLocale());
    }

}