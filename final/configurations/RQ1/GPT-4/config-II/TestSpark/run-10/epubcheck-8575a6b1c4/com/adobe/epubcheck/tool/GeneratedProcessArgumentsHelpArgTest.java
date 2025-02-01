package com.adobe.epubcheck.tool;

import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.*;

public class GeneratedProcessArgumentsHelpArgTest {


    private EpubChecker epubChecker;

    @Test
    public void processArgumentsHelpArgTest() {
        epubChecker = new EpubChecker();
        boolean result = epubChecker.processArguments(new String[]{"--help"});
        assertTrue(result);
    }

}