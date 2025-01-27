package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedGetLocale_SpecificLocaleUsedWhenPassedAsArgument {

    @Test
    public void getLocale_SpecificLocaleUsedWhenPassedAsArgument() {
        EpubChecker checker = new EpubChecker();
        when(checker.getSystemProperties()).thenReturn("fr_FR");
        Locale locale = checker.getLocale();
        assertEquals(Locale.FRANCE, locale);
    }

}