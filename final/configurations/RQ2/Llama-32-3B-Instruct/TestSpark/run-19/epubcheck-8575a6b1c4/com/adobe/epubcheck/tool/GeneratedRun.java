package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedRun {

    @Test
    public void run() throws Exception {
        String[] args = {"--locale", "en"};
        EpubChecker checker = new EpubChecker();
        int result = checker.run(args);
        assertTrue(result >= 0);
    }

}