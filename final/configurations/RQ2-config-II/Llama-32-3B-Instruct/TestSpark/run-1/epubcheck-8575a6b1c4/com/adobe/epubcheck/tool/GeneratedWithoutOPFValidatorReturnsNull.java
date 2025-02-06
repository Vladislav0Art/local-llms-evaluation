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
public class GeneratedWithoutOPFValidatorReturnsNull {

    @Mock
    private Locale locale;

    @Mock
    private String[] args;

    @Mock
    private Map<String, Object> map;

    @Test
    public void withoutOPFValidatorReturnsNull() {
        when(validationContext.withOPFValidator()).thenReturn(null);
        assertNull(EpubChecker instance().withOPFValidator());
    }

    private EpubChecker instance() {
        return new EpubChecker();
    }
}

}