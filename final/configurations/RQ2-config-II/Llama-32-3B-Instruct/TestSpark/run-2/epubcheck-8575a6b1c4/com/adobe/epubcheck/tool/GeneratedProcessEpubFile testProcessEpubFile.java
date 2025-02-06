package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.io.File;
import java.util.Locale;

public class GeneratedProcessEpubFile testProcessEpubFile {

    @Test
    public void processEpubFile

    testProcessEpubFile() throws Exception {
        String[] args = {"arg1", "arg2"};
        EpubChecker instance = new EpubChecker();
        int result = instance.processEpubFile(args);
        assertEquals(0, result);
    }

}