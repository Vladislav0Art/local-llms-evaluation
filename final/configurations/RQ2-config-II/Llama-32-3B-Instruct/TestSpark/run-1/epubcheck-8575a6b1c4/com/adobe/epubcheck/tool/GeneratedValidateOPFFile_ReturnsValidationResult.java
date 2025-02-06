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
public class GeneratedValidateOPFFile_ReturnsValidationResult {

    @Mock
    private Locale locale;

    @Mock
    private String[] args;

    @Mock
    private Map<String, Object> map;

    @Test
    public void validateOPFFile_ReturnsValidationResult() {
        when(opfChecker.validateOPFFile()).thenReturn(0);
        assertEquals(0, instance().validateOPFFile());
    }

}