package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class GeneratedRun_invalidEpubFile_returnsError {

    @Test
    public void run_invalidEpubFile_returnsError() throws Exception {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {"test.epub", "--invalid"};
        int result = epubChecker.run(args);
        assertTrue(result != 0);
    }

}