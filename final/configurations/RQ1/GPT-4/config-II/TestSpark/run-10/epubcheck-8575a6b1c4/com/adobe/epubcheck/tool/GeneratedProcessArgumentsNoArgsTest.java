package com.adobe.epubcheck.tool;

import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.*;

public class GeneratedProcessArgumentsNoArgsTest {


    private EpubChecker epubChecker;

    @Test
    public void processArgumentsNoArgsTest() {
        epubChecker = new EpubChecker();
        boolean result = epubChecker.processArguments(new String[0]);
        assertFalse(result);
    }

}