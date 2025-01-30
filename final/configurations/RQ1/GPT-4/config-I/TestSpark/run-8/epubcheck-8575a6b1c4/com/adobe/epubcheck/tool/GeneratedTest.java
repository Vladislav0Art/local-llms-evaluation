package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void runNoFileTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.run(new String[0]);
        assertEquals(1, result);
    }

    @Test
    public void runInvalidFileTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = new String[1];
        args[0] = "nonExist.epub";
        int result = epubChecker.run(args);
        assertEquals(1, result);
    }

    @Test
    public void runEpubFileFromHttpUrlTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.run(new String[]{"http://example.com/test.epub"});
        assertEquals(1, result);
    }

    @Test
    public void runVersionFlagTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.run(new String[]{"-v", "3.0", "valid.epub"});
        assertEquals(0, result);
    }

    @Test
    public void runModeFlagTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.run(new String[]{"-m", "opf", "valid.epub"});
        assertEquals(0, result);
    }

    @Test
    public void runQuietFlagTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.run(new String[]{"-q", "valid.epub"});
        assertEquals(0, result);
    }

    @Test
    public void processEpubFileEqualRunTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.run(new String[]{"valid.epub"});
        int expectedResult = epubChecker.processEpubFile(new String[]{"valid.epub"});
        assertEquals(expectedResult, result);
    }

    @Test
    public void runCustomMessagesFlagTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = new String[3];
        args[0] = "-c";
        args[1] = "none";
        args[2] = "valid.epub";
        int result = epubChecker.run(args);
        assertEquals(0, result);
    }

}