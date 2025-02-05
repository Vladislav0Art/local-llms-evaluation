package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.DefaultReportImpl;
import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.assertEquals;

public class GeneratedProcessEpubFile_ValidArgsTest {

    @Test
    public void processEpubFile_ValidArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] validArgs = {"test.epub", "EPUB_3_0"};
        int result = epubChecker.processEpubFile(validArgs);
        assertEquals(0, result);
    }

}