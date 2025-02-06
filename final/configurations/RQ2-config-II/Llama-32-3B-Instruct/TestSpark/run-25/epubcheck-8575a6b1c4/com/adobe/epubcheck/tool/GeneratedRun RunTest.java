package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedRun RunTest {

    @Test
    public void run

    RunTest() throws Exception {
        String[] args = {"-l", "en-US"};
        EpubChecker checker = new EpubChecker();
        int result = checker.run(args);
        assertEquals(0, result);
    }

}