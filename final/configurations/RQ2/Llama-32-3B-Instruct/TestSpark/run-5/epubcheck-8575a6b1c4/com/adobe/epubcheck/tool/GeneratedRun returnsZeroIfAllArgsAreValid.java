package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedRun returnsZeroIfAllArgsAreValid {

    @Test
    public void run

    returnsZeroIfAllArgsAreValid() throws IOException {
        String[] argsArray = {"path", "version"};
        EpubChecker checker = new EpubChecker();
        int result = checker.run(argsArray);
        assertEquals(0, result);
    }

}