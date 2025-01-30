package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.Assert.assertEquals;

public class GeneratedRunCustomMessagesFlagTest {

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