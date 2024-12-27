package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.File;
import java.lang.reflect.Field;

public class GeneratedGetLocale_testDefaultReturn {

    private EpubChecker epubChecker;

    public void setEpubChecker(EpubChecker epubChecker) {
        this.epubChecker = epubChecker;
    }

    @Test
    public void getLocale_testDefaultReturn() {
        assertEquals(Locale.getDefault(), epubCheckergetLocale());
    }

}