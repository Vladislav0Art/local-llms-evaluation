package com.adobe.epubcheck.tool;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Locale;
import java.io.File;
import java.io.FileNotFoundException;

import org.mockito.Mockito;

public class GeneratedRunNoArgumentsTest {

    @Test
    public void runNoArgumentsTest() throws FileNotFoundException {
        EpubChecker checker = new EpubChecker();
        assertEquals("Expected return status code 1 for missing arguments", 1, checker.run(new String[]{}));
    }

}