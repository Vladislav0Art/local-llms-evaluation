package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.DefaultReportImpl;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Locale;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTestProcessEpubFileTest {

    @Mock
    private Report report;

    @Test
    public void testProcessEpubFileTest() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"book.epub"};
        int result = checker.processEpubFile(args);
        assertEquals(0, result);
    }

}