package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;

public class GeneratedRun_ValidArgs_ReturnsSuccessStatus {

    @Test
    public void run_ValidArgs_ReturnsSuccessStatus() {
        EpubChecker checker = new EpubChecker();
        int status = checker.run(new String[]{"--epub", "path/to/epub"});
        assertEquals(0, status);
    }

}