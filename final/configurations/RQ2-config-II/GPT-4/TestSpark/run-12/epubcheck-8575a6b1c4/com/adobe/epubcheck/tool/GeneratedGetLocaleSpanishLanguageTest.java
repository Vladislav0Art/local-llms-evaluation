package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

import com.adobe.epubcheck.api.EpubCheck;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.messages.MessageDictionaryDumper;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.DefaultReportImpl;

import java.util.Locale;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetLocaleSpanishLanguageTest {

    @Test
    public void getLocaleSpanishLanguageTest() {
        String[] args = {"--locale", "es"};
        EpubChecker epubChecker = new EpubChecker();
        Locale obtainedLocale = epubChecker.getLocale(args);
        // Spanish locale
        assertEquals("Expecting Spanish locale", new Locale("es"), obtainedLocale);
    }

}