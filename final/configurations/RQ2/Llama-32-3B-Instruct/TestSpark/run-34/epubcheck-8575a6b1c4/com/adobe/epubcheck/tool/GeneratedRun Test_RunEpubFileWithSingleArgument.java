package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import com.adobe.epubcheck.tool.EpubChecker;
import org.w3c.epubcheck.core.Checker;
import org.junit.BeforeClass;

public class GeneratedRun Test_RunEpubFileWithSingleArgument {

    @BeforeClass
    public static void setup() {
        // initialize test data here
    }

    @AfterClass
    public static void tearDown() {
        // clean up test data here
    }

    @Test
    public void run

    Test_RunEpubFileWithSingleArgument() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {"input_file.epub"};
        int result = epubChecker.run(args);
        assertNotNull(result);
    }

}