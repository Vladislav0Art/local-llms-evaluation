package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedRun_NoArgs_Fails {

    @Test
    public void run_NoArgs_Fails() {
        String[] args = {};
        EpubChecker checker = new EpubChecker();
        int result = checker.run(args);
        assertEquals(1, result); // assumes default behavior throws an exception
    }

}