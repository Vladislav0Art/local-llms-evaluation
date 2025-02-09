package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedGetLocale_LocalePassed_ReturnsLocale {

    @Test
    public void getLocale_LocalePassed_ReturnsLocale() {
        Locale locale = Locale.FRANCE;
        when(EpubChecker.class.getConstructor().newInstance()).thenReturn(locale);
        String[] args = new String[]{String.valueOf(locale)};
        EpubChecker checker = new EpubChecker();
        assertEquals(locale, checker.getLocale(args));
    }

}