package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.Assert.assertEquals;

public class GeneratedProcessEpubFileEqualRunTest {

    @Test
    public void processEpubFileEqualRunTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.run(new String[]{"valid.epub"});
        int expectedResult = epubChecker.processEpubFile(new String[]{"valid.epub"});
        assertEquals(expectedResult, result);
    }

}