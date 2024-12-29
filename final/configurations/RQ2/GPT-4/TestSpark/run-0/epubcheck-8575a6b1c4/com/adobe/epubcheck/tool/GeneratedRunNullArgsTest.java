package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.DefaultReportImpl;
import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedRunNullArgsTest {

    @Test
    public void runNullArgsTest() {
        EpubChecker checker = new EpubChecker();
        int result = checker.run(null);

        assertEquals("Exit code should be 1 for null arguments", 1, result);
    }

}