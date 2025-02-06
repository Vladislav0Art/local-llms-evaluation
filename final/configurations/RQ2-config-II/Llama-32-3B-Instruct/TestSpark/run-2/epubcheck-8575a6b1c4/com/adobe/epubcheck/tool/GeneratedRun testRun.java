package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.io.File;
import java.util.Locale;

public class GeneratedRun testRun {

    @Test
    public void run

    testRun() throws Exception {
        String[] args = {"arg1", "arg2"};
        EpubChecker instance = new EpubChecker();
        int result = instance.run(args);
        assertEquals(0, result);
    }

}