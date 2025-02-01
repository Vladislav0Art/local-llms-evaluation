package com.adobe.epubcheck.tool;

import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.*;

public class GeneratedRunHelpArgTest {


    private EpubChecker epubChecker;

    @Test
    public void runHelpArgTest() {
        epubChecker = new EpubChecker();
        int result = epubChecker.run(new String[]{"--help"});
        assertEquals(1, result);
    }

}