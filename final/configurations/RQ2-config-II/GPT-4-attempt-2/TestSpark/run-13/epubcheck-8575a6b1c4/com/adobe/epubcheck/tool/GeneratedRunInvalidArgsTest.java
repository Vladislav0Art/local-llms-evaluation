package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Locale;

public class GeneratedRunInvalidArgsTest {

    @Test
    public void runInvalidArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] invalidArgs = {"nonexistent.epub"};
        int result = epubChecker.run(invalidArgs);
        assertEquals(1, result);
    }

}