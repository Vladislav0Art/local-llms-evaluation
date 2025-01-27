package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedRun {

    @Test
    public void run() throws IOException {
        String[] argsArray = {"path", "version"};
        EpubChecker checker = new EpubChecker();
        int result = checker.run(argsArray);
        assertEquals(0, result);
    }

}