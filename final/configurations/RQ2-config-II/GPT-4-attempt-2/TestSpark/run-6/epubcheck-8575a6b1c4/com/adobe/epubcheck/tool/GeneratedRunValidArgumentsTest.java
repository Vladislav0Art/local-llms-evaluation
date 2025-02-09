package com.adobe.epubcheck.tool;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Locale;
import java.io.File;
import java.io.FileNotFoundException;

import org.mockito.Mockito;

public class GeneratedRunValidArgumentsTest {

    @Test
    public void runValidArgumentsTest() throws FileNotFoundException {
        PrintWriter out = Mockito.mock(PrintWriter.class);
        outWriter.setPrintWriter(out);
        EpubChecker checker = new EpubChecker();
        assertEquals("Expected return status code 0", 0, checker.run(new String[]{new File("test.epub").getAbsolutePath()}));
        Mockito.verify(out).println("No errors or warnings detected.");
    }

}