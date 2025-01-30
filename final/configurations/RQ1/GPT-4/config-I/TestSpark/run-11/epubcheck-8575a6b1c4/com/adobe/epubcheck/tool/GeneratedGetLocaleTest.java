package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.InvalidVersionException;
import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

public class GeneratedGetLocaleTest {

    @Test
    public void getLocaleTest() {
        EpubChecker checker = new EpubChecker();
        Locale expected = Locale.getDefault();
        Locale actual = checker.getLocale();
        Assert.assertEquals(expected, actual);
    }

}