package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.DefaultReportImpl;
import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.assertEquals;

public class GeneratedRun_NullArgsTest {

    @Test
    public void run_NullArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] nullArgs = null;
        int result = epubChecker.run(nullArgs);
        assertEquals(0, result);
    }

}