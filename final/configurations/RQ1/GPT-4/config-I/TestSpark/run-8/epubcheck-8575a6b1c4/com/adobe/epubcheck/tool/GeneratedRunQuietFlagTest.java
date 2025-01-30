package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.Assert.assertEquals;

public class GeneratedRunQuietFlagTest {

    @Test
    public void runQuietFlagTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.run(new String[]{"-q", "valid.epub"});
        assertEquals(0, result);
    }

}