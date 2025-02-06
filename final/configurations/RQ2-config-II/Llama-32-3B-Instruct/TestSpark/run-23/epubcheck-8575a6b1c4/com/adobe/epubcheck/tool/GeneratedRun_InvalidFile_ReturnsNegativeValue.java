package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class GeneratedRun_InvalidFile_ReturnsNegativeValue {

    @Test
    public void run_InvalidFile_ReturnsNegativeValue() {
        EpubChecker checker = new EpubChecker();
        int result = checker.run(new String[]{"invalid_file"});
        assertTrue(result < 0);
    }

}