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
    public void testGetLocale() {
        assertEquals(locale, epubChecker.getLocale());
    }

    @Test
    public void testRun_NoArguments() {
        String[] args = {};
        int result = epubChecker.run(args);
        assertEquals(1, result);
    }

    @Test
    public void testRun_InvalidVersion() {
        String[] args = {"-v", "2"};
        int result = epubChecker.run(args);
        assertEquals(1, result);
    }

    @Test
    public void testRun_ValidVersion() {
        String[] args = {"-v", "3"};
        int result = epubChecker.run(args);
        assertEquals(0, result);
    }

    @Test
    public void testRun_Mode() {
        String[] args = {"-m", "opf"};
        int result = epubChecker.run(args);
        assertEquals(0, result);
    }

    @Test
    public void testRun_Profile() {
        String[] args = {"-p", "EPUBProfile.DEFAULT"};
        int result = epubChecker.run(args);
        assertEquals(0, result);
    }

    @Test
    public void testRun_Save() {
        String[] args = {"-s"};
        int result = epubChecker.run(args);
        assertEquals(0, result);
    }

    @Test
    public void testRun_Out() {
        String[] args = {"-o", "output.xml"};
        int result = epubChecker.run(args);
        assertEquals(0, result);
    }

    @Test
    public void testRun_Json() {
        String[] args = {"-j", "output.json"};
        int result = epubChecker.run(args);
        assertEquals(0, result);
    }

}