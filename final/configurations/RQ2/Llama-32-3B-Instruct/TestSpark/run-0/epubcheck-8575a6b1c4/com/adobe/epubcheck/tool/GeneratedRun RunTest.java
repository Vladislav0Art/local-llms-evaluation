package com.adobe.epubcheck.tool;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class GeneratedRun RunTest {

    @BeforeClass
    public static void init() {
        // setup
    }

    @Test
    public void run

    RunTest() {
        EpubChecker instance = new EpubChecker();
        int result = instance.run(new String[]{});
        assertTrue(result >= 0);
    }

}