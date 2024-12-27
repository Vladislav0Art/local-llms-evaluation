package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.File;
import java.lang.reflect.Field;

public class GeneratedGetLocale_testCustomReturn {

    private EpubChecker epubChecker;

    public void setEpubChecker(EpubChecker epubChecker) {
        this.epubChecker = epubChecker;
    }

    @Test
    public void getLocale_testCustomReturn() {
        Locale locale = new Locale("en", "US");
        epubChecker.setLocale(locale);
        assertEquals(locale, epubChecker.toLocale());
    }

}