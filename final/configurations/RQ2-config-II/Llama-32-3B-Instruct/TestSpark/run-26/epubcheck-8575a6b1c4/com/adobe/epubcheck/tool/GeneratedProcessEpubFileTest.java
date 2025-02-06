package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;

public class GeneratedProcessEpubFileTest {

    @Test
    public void processEpubFileTest() {
        @SuppressWarnings("UnusedParameters")
        String[] args = {"path/to/file"};
        EpubChecker checker = new EpubChecker();
        int result = checker.processEpubFile(args);
        assertFalse(result < 0);
    }

}