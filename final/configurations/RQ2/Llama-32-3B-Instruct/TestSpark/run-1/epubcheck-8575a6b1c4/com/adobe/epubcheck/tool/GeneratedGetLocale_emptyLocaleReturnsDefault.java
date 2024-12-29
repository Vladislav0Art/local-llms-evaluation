package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class GeneratedGetLocale_emptyLocaleReturnsDefault {

    @Test
    public void getLocale_emptyLocaleReturnsDefault() {
        Locale locale = new EpubChecker().getLocale();
        assertEquals(Locale.getDefault(), locale);
    }

}