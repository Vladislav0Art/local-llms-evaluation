package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedRun RunEpubFileValid {

    @Test
    public void run

    RunEpubFileValid() throws Exception {
        String[] args = {"path/to/epub/file.epub", "valid-profile"};
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.run(args);
        assertEquals(0, result);
    }

}