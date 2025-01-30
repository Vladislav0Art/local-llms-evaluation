package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.Assert.assertEquals;

public class GeneratedRunInvalidFileTest {

    @Test
    public void runInvalidFileTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = new String[1];
        args[0] = "nonExist.epub";
        int result = epubChecker.run(args);
        assertEquals(1, result);
    }

}