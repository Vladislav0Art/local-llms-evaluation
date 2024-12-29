package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class GeneratedGetLocale_nullReturnsDefault {

    @Test
    public void getLocale_nullReturnsDefault() {
        Locale locale = new EpubChecker().getLocale(null);
        assertEquals(Locale.getDefault(), locale);
    }

}