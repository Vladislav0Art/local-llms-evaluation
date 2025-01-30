package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.DefaultReportImpl;
import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedProcessEpubFileWithEmptyArgsTest {

    @Test
    public void processEpubFileWithEmptyArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        int expected = 1;
        String[] args = new String[0];
        int actual = epubChecker.processEpubFile(args);
        assertEquals(expected, actual);
    }

}