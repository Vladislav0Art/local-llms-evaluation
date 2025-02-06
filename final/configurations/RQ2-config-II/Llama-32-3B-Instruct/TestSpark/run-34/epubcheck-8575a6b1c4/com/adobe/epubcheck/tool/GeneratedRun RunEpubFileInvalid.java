package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedRun RunEpubFileInvalid {

    @Test
    public void run

    RunEpubFileInvalid() throws Exception {
        String[] args = {"path/to/epub/file.epub", "invalid-profile"};
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.run(args);
        assertEquals(1, result);
    }

}