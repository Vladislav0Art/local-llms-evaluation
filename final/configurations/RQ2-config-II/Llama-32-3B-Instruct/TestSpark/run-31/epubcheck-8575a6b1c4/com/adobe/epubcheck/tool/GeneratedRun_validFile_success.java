package com.adobe.epubcheck.tool;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRun_validFile_success {

    @Mock
    private OPFChecker opfChecker;

    @Mock
    private OPSChecker opscChecker;

    @Mock
    private OverlayChecker overlayChecker;

    @Mock
    private NavChecker navChecker;

    @Mock
    private MessageDictionaryDumper messageDictionaryDumper;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void run_validFile_success() throws Exception {
        File file = new File("valid.epub");
        String[] args = {"-f", file.getAbsolutePath()};
        when(run(args)).thenReturn(0);
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.run(args);
        assertEquals(0, result);
    }

}