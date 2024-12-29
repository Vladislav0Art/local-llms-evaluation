package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class GeneratedRun_validEpubFile_runsSuccessfully {

    @Test
    public void run_validEpubFile_runsSuccessfully() throws Exception {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {"test.epub", "--verbose"};
        int result = epubChecker.run(args);
        assertTrue(result == 0);
    }

}