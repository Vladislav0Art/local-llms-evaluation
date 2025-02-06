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
public class GeneratedValidateOPFFile_ReturnsInvalidResult {

    @Mock
    private Locale locale;

    @Mock
    private String[] args;

    @Mock
    private Map<String, Object> map;

    @Test
    public void validateOPFFile_ReturnsInvalidResult() {
        when(opfChecker.validateOPFFile()).thenReturn(1);
        assertEquals(1, instance().validateOPFFile());
    }

    private EpubChecker instance() {
        return new EpubChecker();
    }
}

}