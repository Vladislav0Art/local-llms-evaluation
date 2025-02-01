package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.api.Report;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

public class GeneratedGetLocaleTest {

    @Test
    public void getLocaleTest() {
        EpubChecker checker = new EpubChecker();
        Locale result = checker.getLocale();
        assertEquals(Locale.getDefault(), result);
    }

}