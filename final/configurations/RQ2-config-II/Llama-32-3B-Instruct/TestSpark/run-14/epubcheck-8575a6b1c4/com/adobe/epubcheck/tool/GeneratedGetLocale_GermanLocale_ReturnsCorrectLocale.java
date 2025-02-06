package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetLocale_GermanLocale_ReturnsCorrectLocale {

    @Mock
    private Checker checker;

    @Mock
    private LocalizableReport report;

    @InjectMocks
    private EpubChecker epubChecker;

    @Test
    public void getLocale_GermanLocale_ReturnsCorrectLocale() {
        Locale locale = epubChecker.getLocale();
        assertEquals(Locale.GERMAN, locale);
    }

}