package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestRun_Save {

    @InjectMocks
    private EpubChecker epubChecker;

    @Mock
    private Messages messages;

    @Mock
    private Locale locale;

    @Mock
    private Report report;

    @Mock
    private PrintWriter outWriter;

    @Test
    public void testRun_Save() {
        String[] args = {"-s"};
        int result = epubChecker.run(args);
        assertEquals(0, result);
    }

}