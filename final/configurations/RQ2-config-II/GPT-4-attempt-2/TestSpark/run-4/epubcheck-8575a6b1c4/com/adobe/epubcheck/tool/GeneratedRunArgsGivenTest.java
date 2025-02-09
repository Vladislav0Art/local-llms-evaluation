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

public class GeneratedRunArgsGivenTest {

    @Test
    public void runArgsGivenTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = new String[]{"-v", "3.0", "test.epub"};
        int result = epubChecker.run(args);
        // the result may vary based on the existance of "test.epub", so adjust this testcase accordingly
        assertEquals(1, result);
    }

}