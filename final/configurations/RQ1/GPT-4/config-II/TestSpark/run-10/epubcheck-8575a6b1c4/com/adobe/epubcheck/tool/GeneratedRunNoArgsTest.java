package com.adobe.epubcheck.tool;

import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.*;

public class GeneratedRunNoArgsTest {


    private EpubChecker epubChecker;

    @Test
    public void runNoArgsTest() {
        epubChecker = new EpubChecker();
        int result = epubChecker.run(new String[0]);
        assertEquals(1, result);
    }

}