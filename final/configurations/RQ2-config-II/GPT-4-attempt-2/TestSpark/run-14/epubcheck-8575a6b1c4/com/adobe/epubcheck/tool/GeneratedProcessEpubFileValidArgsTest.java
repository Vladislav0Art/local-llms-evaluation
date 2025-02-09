package com.adobe.epubcheck.tool;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.DefaultReportImpl;
import com.adobe.epubcheck.util.EPUBVersion;

public class GeneratedProcessEpubFileValidArgsTest {

    @Test
    public void processEpubFileValidArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = new String[]{"valid.epub"};
        int result = epubChecker.processEpubFile(args);
        assertEquals("Result mismatched.", 0, result);
    }

}