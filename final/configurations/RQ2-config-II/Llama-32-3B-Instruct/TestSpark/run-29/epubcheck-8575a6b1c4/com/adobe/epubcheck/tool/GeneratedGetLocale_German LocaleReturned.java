package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;

@RunWith(PowerMockito.class)
public class GeneratedGetLocale_German LocaleReturned {

    @Mock
    private EPUBProfile profile;

    @Mock
    private EpubCheckFactory factory;

    @InjectMocks
    private EpubChecker epubChecker;

    @Test
    public void getLocale_German

    LocaleReturned() {
        MockitoAnnotations.initMocks(this);
        PowerMockito.when(profile.getLocale()).thenReturn(Locale.GERMAN);
        assertEquals(Locale.GERMAN, epubCheckergetLocale());
    }

}