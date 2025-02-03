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
public class GeneratedTest {

    @InjectMocks
    private com.adobe.epubcheck.tool.EpubChecker epubChecker;

    @Mock
    private com.adobe.epubcheck.api.Messages messages;

    @Mock
    private java.util.Locale locale;

    @Mock
    private com.adobe.epubcheck.api.Report report;

    @Mock
    private PrintWriter outWriter;

    @Test
    public void testGetLocale() {
        assertEquals(locale, epubChecker.getLocale());
    }

    @Test
    public void testRun_NoArguments() {
        String[] args = {
        }

    }