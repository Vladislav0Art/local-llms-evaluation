package com.adobe.epubcheck.tool;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Locale;

import org.junit.Test;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.DefaultReportImpl;
import com.adobe.epubcheck.util.EPUBVersion;

public class GeneratedProcessEpubFileValidArgsTest {

    @Test
    public void processEpubFileValidArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {"sample.epub"};
        int result = epubChecker.processEpubFile(args);
        assertEquals("Should return success code", 0, result);
    }

}