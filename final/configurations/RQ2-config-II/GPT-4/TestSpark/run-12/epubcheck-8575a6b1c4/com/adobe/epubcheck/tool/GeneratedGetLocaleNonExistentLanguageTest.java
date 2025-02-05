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
public class GeneratedGetLocaleNonExistentLanguageTest {

    @Test
    public void getLocaleNonExistentLanguageTest() {
        String[] args = {"invalid_lang"};
        EpubChecker epubChecker = new EpubChecker();
        Locale obtainedLocale = epubChecker.getLocale(args);
        // Non-existent language so, it will return a default locale
        assertEquals("Expecting default locale", Locale.getDefault(), obtainedLocale);
    }

}