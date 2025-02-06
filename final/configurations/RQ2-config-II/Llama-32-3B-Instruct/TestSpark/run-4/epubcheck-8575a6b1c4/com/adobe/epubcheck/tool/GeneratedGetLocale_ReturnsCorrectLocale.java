package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.contrib.java.lang.system.SystemPropertyRule;
import com.adobe.epubcheck.tool.EpubChecker;

public class GeneratedGetLocale_ReturnsCorrectLocale {

    @Rule
    public final SystemPropertyRule systemProperties = new SystemPropertyRule()
            .set("epub.checker.locale", "en_US");

    @Test
    public void getLocale_ReturnsCorrectLocale() {
        EpubChecker checker = new EpubChecker();
        assertEquals(Locale.US, checker.getLocale());
    }

}