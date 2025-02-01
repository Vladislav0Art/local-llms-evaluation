package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.io.IOException;
import java.io.File;
import java.util.Locale;

public class GeneratedValidateFileTest {

    @Test
    public void validateFileTest() throws IOException {
        File tempFile = File.createTempFile("testfile", ".txt");
        tempFile.deleteOnExit();
        EpubChecker epubChecker = new EpubChecker();
        epubChecker.path = tempFile.getAbsolutePath();
        int returnValue = epubChecker.validateFile(tempFile.getAbsolutePath(), EPUBVersion.VERSION_3, new DefaultReportImpl(tempFile.getAbsolutePath()), EPUBProfile.DEFAULT);
        assertEquals(1, returnValue);
    }

}