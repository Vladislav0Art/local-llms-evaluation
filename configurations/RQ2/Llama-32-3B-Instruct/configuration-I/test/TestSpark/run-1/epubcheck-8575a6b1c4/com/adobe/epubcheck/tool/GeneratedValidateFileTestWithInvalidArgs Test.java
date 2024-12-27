package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.Mockito;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedValidateFileTestWithInvalidArgs Test {

    @Mock
    private Locale locale;

    @Test
    public void validateFileTestWithInvalidArgs

    Test() {
        String path = "/path/to/file";
        when(locale.toString()).thenReturn("en_US");
        Report report = new Report();
        EPUBProfile profile = new EPUBProfile();
        assertEquals(1, new EpubChecker().validateFile(path, "invalid-version", report, profile));
    }

}