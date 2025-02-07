package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedGetLocale_ReturnsLocale {

    @Test
    public void getLocale_ReturnsLocale() {
        EpubChecker checker = new EpubChecker();
        Locale locale = checker.getLocale();
        assertNotNull(locale);
    }
}

}