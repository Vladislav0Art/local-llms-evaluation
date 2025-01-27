package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GeneratedGetLocale_testGetLocale {

    @Test
    public void getLocale_testGetLocale() {
        Locale locale = EpubChecker(Locale.ROOT).getLocale();
        assertNotNull(locale);
    }

}