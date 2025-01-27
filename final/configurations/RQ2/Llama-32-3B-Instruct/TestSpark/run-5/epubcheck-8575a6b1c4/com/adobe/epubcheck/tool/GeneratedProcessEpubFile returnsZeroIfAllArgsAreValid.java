package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedProcessEpubFile returnsZeroIfAllArgsAreValid {

    @Test
    public void processEpubFile

    returnsZeroIfAllArgsAreValid() {
        EpubChecker checker = new EpubChecker();
        String[] argsArray = {"path", "version"};
        int result = checker.processEpubFile(argsArray);
        assertEquals(0, result);
    }

}