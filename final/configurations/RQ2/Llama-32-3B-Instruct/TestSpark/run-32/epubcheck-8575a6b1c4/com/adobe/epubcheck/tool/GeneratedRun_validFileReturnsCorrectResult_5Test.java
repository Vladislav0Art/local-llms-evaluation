package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedRun_validFileReturnsCorrectResult_5Test {

    @Test
    public void run_validFileReturnsCorrectResult_5Test() {
        File file = new File("valid_file.epub");
        String[] args = {"--output", "output_file"};
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.run(args);
        assertTrue(result == 0);
    }

}