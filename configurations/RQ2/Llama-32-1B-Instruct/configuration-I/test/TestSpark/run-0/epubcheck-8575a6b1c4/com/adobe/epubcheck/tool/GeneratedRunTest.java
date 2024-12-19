package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import org.junit.jupiter.api.Test;
import com.adobe.epubcheck.tool.EpubVersion;

import java.io.File;

public class GeneratedRunTest {

    @Test
    public void runTest() {
        String[] args = {};
        int result = EpubChecker.run(args);
        assertTrue(result == 0);
    }

}