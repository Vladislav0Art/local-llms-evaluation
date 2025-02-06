package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;

public class GeneratedRunTest {

    @Test
    public void runTest() throws Exception {
        String[] args = {"path/to/file"};
        EpubChecker checker = new EpubChecker();
        int result = checker.run(args);
        assertTrue(result >= 0);
    }

}