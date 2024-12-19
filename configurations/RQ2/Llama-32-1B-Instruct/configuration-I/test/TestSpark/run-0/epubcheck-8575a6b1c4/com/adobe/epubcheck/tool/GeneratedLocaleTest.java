package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import org.junit.jupiter.api.Test;
import com.adobe.epubcheck.tool.EpubVersion;

import java.io.File;

public class GeneratedLocaleTest {

    @Test
    public void LocaleTest() {
        EpubChecker checker = new EpubChecker();
        Locale locale = checker.getLocale();
        assertEquals(Locale.ENGLISH, locale);
    }

}