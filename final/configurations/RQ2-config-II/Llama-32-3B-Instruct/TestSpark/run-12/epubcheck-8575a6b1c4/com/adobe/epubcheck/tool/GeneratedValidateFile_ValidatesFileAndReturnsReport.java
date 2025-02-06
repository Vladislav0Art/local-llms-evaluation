package com.adobe.epubcheck.tool;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedValidateFile_ValidatesFileAndReturnsReport {

    @Mock
    private EpubCheckFactory epubCheckFactory;

    @Mock
    private Checker checker;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void validateFile_ValidatesFileAndReturnsReport() throws IOException {
        when(epubCheckFactory.validateFile(anyString(), anyString(), anyString(), anyString())).thenReturn(new Report());
        File epubFile = new File("example.epub");
        EpubChecker epubChecker = new EpubChecker();
        assertEquals(new Report(), epubChecker.validateFile(epubFile.getAbsolutePath(), EPUBVersion.V20, new Report(), new EPUBProfile()));
    }

}