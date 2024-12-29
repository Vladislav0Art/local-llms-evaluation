package com.adobe.epubcheck.tool;

import java.util.Locale;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class GeneratedRun_RunsEpubFileWithDefaultArguments {

    @BeforeClass
    public static void init() {
        // setup
    }

    @Test
    public void run_RunsEpubFileWithDefaultArguments() {
        EpubChecker instance = new EpubChecker();
        int result = instance.run(new String[]{});
        assertTrue(result >= 0);
    }

}