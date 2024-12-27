package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.Mockito;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedValidateFileTestWithValidArgsTest {

    @Mock
    private Locale locale;

    @Test
    public void validateFileTestWithValidArgsTest() {
        String path = "/path/to/file";
        when(locale.toString()).thenReturn("en_US");
        Report report = new Report();
        EPUBProfile profile = new EPUBProfile();
        assertEquals(0, new EpubChecker().validateFile(path, "1.0", report, profile));
    }

}