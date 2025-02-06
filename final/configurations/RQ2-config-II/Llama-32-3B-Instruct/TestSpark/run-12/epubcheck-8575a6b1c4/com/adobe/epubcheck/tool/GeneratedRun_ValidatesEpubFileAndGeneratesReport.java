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
public class GeneratedRun_ValidatesEpubFileAndGeneratesReport {

    @Mock
    private EpubCheckFactory epubCheckFactory;

    @Mock
    private Checker checker;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void run_ValidatesEpubFileAndGeneratesReport() throws IOException {
        when(epubCheckFactory.run(anyString())).thenReturn(0);
        File epubFile = new File("example.epub");
        when(checker.validateFile(anyString(), anyString(), anyString(), anyString())).thenReturn(new Report());
        EpubChecker epubChecker = new EpubChecker();
        epubChecker.run(new String[]{"--epub", epubFile.getAbsolutePath()});
    }

}