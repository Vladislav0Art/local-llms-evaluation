package com.adobe.epubcheck.tool;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.tool.EpubChecker;

import static org.mockito.Mockito.*;

import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.DefaultReportImpl;
import com.adobe.epubcheck.util.EPUBVersion;
import org.mockito.Mock;

import java.util.Locale;

public class GeneratedShakeCoverageTreeTest {

    @Mock
    Report reportMock;

    @Test
    public void shakeCoverageTreeTest() {
        EpubChecker instance = new EpubChecker();
        DefaultReportImpl report = new DefaultReportImpl("/valid/path");
        assertNotNull(instance.processFile(report));
    }

}