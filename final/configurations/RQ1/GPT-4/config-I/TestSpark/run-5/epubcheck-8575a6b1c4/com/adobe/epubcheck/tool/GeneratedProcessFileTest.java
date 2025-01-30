package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.DefaultReportImpl;
import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedProcessFileTest {

    @Test
    public void processFileTest() {
        EpubChecker epubChecker = new EpubChecker();
        int expected = 1;
        DefaultReportImpl report = new DefaultReportImpl("sample.txt");
        epubChecker.path = "sample.txt";
        int actual = epubChecker.processFile(report);
        assertEquals(expected, actual);
    }

}