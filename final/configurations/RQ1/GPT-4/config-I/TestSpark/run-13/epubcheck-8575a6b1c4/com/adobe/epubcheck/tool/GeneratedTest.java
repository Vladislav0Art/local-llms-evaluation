package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.InvalidVersionException;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void processArgumentsInvalidVersionTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {"-v"};
        epubChecker.run(args);
    }

    @Test
    public void processArgumentsModeExpectedTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {"-m"};
        epubChecker.run(args);
    }

    @Test
    public void runHelpArgumentTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {"-help"};
        epubChecker.run(args);
    }

    @Test
    public void getLocaleDefaultTest() {
        EpubChecker epubChecker = new EpubChecker();
        Locale expected_locale = Locale.getDefault();
        assertEquals(expected_locale, epubChecker.getLocale());
    }

    @Test
    public void processArgumentsNoArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {};
        int result = epubChecker.run(args);
        assertEquals(1, result);
    }

    @Test
    public void processArgumentsUnknownArgumentTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {"-unknown"};
        int result = epubChecker.run(args);
        assertEquals(1, result);
    }

    @Test
    public void processArgumentsVersionTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {"-v", "2.0"};
        epubChecker.run(args);
    }

    @Test
    public void processArgumentsModeTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {"-m", "opf"};
        epubChecker.run(args);
    }

    @Test
    public void processArgumentsRunTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {"./test.epub", "-v", "2.0"};
        int val = epubChecker.run(args);
        assertEquals(val, 1);
    }

}