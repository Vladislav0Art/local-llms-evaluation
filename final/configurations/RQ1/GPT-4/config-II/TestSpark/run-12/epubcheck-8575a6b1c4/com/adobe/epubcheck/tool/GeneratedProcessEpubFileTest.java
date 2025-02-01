package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.api.Report;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

public class GeneratedProcessEpubFileTest {

    @Test
    public void processEpubFileTest() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"other.epub"};
        int result = checker.processEpubFile(args);
        assertEquals(0, result);
    }

}