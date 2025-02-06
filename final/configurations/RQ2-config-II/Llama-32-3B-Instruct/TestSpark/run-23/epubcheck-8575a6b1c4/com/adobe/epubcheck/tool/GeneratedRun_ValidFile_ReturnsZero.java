package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class GeneratedRun_ValidFile_ReturnsZero {

    @Test
    public void run_ValidFile_ReturnsZero() {
        EpubChecker checker = new EpubChecker();
        int result = checker.run(new String[]{});
        assertEquals(0, result);
    }

}