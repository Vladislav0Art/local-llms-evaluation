package com.adobe.epubcheck.tool;

import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.*;

public class GeneratedProcessArgumentsInvalidArgTest {


    private EpubChecker epubChecker;

    @Test
    public void processArgumentsInvalidArgTest() {
        epubChecker = new EpubChecker();
        boolean result = epubChecker.processArguments(new String[]{"--invalid"});
        assertFalse(result);
    }

}