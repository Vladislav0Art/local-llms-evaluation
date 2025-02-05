package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.DefaultReportImpl;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Locale;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class GeneratedProcessEpubFileInvalidArgsTest {

    @Test
    public void processEpubFileInvalidArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {};
        assertEquals(1, epubChecker.processEpubFile(args));
    }

}