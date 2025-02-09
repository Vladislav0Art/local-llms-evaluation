package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedRun_invalidArgs testRunInvalidArgs {

    @Test
    public void run_invalidArgs

    testRunInvalidArgs() {
        String[] args = {"arg1", null};
        EpubChecker epubChecker = new EpubChecker();
        try {
            int result = epubChecker.run(args);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
        }
    }

}