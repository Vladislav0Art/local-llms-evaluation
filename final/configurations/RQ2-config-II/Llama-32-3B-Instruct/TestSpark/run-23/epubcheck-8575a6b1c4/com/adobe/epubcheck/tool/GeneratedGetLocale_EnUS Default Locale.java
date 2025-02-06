package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class GeneratedGetLocale_EnUS Default Locale {

    @Test
    public void getLocale_EnUS

    Default Locale() {
        EpubChecker checker = new EpubChecker();
        assertEquals(Locale.EN_US, checker.Locale());
    }

}