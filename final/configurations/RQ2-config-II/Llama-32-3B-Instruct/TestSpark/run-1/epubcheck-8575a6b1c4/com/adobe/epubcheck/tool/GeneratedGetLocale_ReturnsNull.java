package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetLocale_ReturnsNull {

    @Mock
    private Locale locale;

    @Mock
    private String[] args;

    @Mock
    private Map<String, Object> map;

    @Test
    public void getLocale_ReturnsNull() {
        when(locale).thenReturn(null);
        assertNull(EpubChecker instance().getLocale());
    }

    private EpubChecker instance() {
        return new EpubChecker();
    }
}

}