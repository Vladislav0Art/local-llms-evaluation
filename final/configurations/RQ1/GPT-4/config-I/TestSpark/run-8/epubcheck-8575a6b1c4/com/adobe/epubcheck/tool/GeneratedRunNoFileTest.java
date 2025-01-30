package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.Assert.assertEquals;

public class GeneratedRunNoFileTest {

    @Test
    public void runNoFileTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.run(new String[0]);
        assertEquals(1, result);
    }

}