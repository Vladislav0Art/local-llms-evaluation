package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.File;

public class GeneratedTestInvalidVersion {

    @Test
    public void testInvalidVersion() {
        Checker checker = new Checker();
        String expectedOutput = "Invalid version specified in the command line (expected 4 characters, got 10)";
        assertEquals(expectedOutput, checker.checkVersion("12.0"));
    }

}