package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedRun RunEpubFileEmptyArgs {

    @Test
    public void run

    RunEpubFileEmptyArgs() throws Exception {
        String[] args = {};
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.run(args);
        assertEquals(1, result);
    }

}