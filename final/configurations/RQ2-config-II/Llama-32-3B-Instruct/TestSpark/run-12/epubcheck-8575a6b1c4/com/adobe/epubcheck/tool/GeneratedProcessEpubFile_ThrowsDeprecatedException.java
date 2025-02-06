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
public class GeneratedProcessEpubFile_ThrowsDeprecatedException {

    @Mock
    private EpubCheckFactory epubCheckFactory;

    @Mock
    private Checker checker;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void processEpubFile_ThrowsDeprecatedException() {
        when(epubCheckFactory.processEpubFile(anyString())).thenReturn(0);
        EpubChecker epubChecker = new EpubChecker();
        try {
            epubChecker.processEpubFile(new String[]{"--epub", "example.epub"});
            assert false : "Expected Deprecated exception";
        } catch (DeprecatedException e) {
            assertTrue(e.getMessage().contains("Use run() method instead"));
        }
    }

}