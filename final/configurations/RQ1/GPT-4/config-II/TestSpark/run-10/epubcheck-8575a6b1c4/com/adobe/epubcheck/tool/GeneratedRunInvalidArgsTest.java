package com.adobe.epubcheck.tool;

import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.*;

public class GeneratedRunInvalidArgsTest {


    private EpubChecker epubChecker;

    @Test
    public void runInvalidArgsTest() {
        epubChecker = new EpubChecker();
        int result = epubChecker.run(new String[]{"--invalid"});
        assertEquals(1, result);
    }

}