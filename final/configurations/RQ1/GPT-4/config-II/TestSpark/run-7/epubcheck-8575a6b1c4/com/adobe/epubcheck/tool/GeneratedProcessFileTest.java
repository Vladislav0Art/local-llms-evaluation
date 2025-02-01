package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.io.IOException;
import java.io.File;
import java.util.Locale;

public class GeneratedProcessFileTest {

    @Test
    public void processFileTest() throws IOException {
        File tempFile = File.createTempFile("testfile", ".txt");
        tempFile.deleteOnExit();
        EpubChecker epubChecker = new EpubChecker();
        epubChecker.path = tempFile.getAbsolutePath();
        int returnValue = epubChecker.processFile(new DefaultReportImpl(tempFile.getAbsolutePath()));
        assertEquals(1, returnValue);
    }

}