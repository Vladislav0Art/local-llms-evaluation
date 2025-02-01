package com.adobe.epubcheck.tool;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.Locale;

import org.junit.Test;
import org.mockito.Mockito;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.Messages;

public class GeneratedTest {

    @Test
    public void processArgumentsIncorrectLocaleTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {"--locale", "-"};

        assertEquals(false, epubChecker.processArguments(args));
    }

    @Test
    public void processArgumentsMissingLocaleTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {"--locale"};

        assertEquals(false, epubChecker.processArguments(args));
    }

    @Test
    public void processArgumentsOutputTypeConflictTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {"--json", "--xmp", "targetFile"};

        assertEquals(false, epubChecker.processArguments(args));
    }

    @Test
    public void processArgumentsNoFileSpecifiedTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {};

        assertEquals(false, epubChecker.processArguments(args));
    }

    @Test
    public void processArgumentsModeVersionIgnoredTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {"-m", "opf", "sample.epub"};

        assertEquals(false, epubChecker.processArguments(args));
    }

    @Test
    public void processArgumentsModeRequiredTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {"sample.xhtml"};

        assertEquals(false, epubChecker.processArguments(args));
    }

    @Test
    public void processArgumentsDefaultTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {"-v", "2.0", "sample.epub"};

        assertEquals(true, epubChecker.processArguments(args));
    }

    @Test
    public void runHelpTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {"-help"};

        assertEquals(1, epubChecker.run(args));
    }

    @Test
    public void runNoArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {};

        assertEquals(1, epubChecker.run(args));
    }

    @Test
    public void runModeTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {"-m", "opf", "sample.opf"};

        assertEquals(1, epubChecker.run(args));
    }

    @Test
    public void getLocaleTest() {
        EpubChecker epubChecker = new EpubChecker();
        Locale expectedLocale = Locale.getDefault();
        Locale actualLocale = epubChecker.getLocale();

        assertEquals(expectedLocale, actualLocale);
    }

}