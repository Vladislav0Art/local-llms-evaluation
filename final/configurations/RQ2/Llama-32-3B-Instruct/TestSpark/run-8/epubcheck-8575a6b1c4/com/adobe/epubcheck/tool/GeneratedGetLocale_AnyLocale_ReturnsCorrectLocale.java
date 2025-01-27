package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;

import org.w3c.epubcheck.core.Checker;
import org.w3c.epubcheck.util.url.URLUtils;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.EpubCheck;
import com.adobe.epubcheck.api.LocalizableReport;
import com.adobe.epubcheck.api.Report;

public class GeneratedGetLocale_AnyLocale_ReturnsCorrectLocale {

    @Test
    public void getLocale_AnyLocale_ReturnsCorrectLocale() {
        EpubChecker checker = new EpubChecker();
        Locale locale = checker.getLocale();
        assertTrue(locale != null);
    }

}