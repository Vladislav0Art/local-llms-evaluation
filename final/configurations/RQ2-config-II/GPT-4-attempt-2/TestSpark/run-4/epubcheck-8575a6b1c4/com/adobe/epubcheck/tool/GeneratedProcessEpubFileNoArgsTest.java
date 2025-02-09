package com.adobe.epubcheck.tool;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

import org.junit.Test;

import java.util.Locale;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.DefaultReportImpl;
import com.adobe.epubcheck.util.EPUBVersion;

public class GeneratedProcessEpubFileNoArgsTest {

    @Test
    public void processEpubFileNoArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = new String[0];
        int result = epubChecker.processEpubFile(args);
        assertEquals(1, result);
    }

}