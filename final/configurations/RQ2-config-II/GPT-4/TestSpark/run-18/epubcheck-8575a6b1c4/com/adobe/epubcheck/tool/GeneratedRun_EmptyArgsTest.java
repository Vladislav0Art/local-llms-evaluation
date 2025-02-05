package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.DefaultReportImpl;
import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.assertEquals;

public class GeneratedRun_EmptyArgsTest {

    @Test
    public void run_EmptyArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] emptyArgs = {};
        int result = epubChecker.run(emptyArgs);
        assertEquals(0, result);
    }

}