package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedRun testRun {

    @Test
    public void run

    testRun() {
        String[] args = {"arg1", "arg2"};
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.run(args);
        assertTrue(result >= 0 && result < 1000000);
    }

}