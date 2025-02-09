package com.adobe.epubcheck.tool;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Locale;

import org.junit.Test;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.DefaultReportImpl;
import com.adobe.epubcheck.util.EPUBVersion;

public class GeneratedRunEmptyArgsTest {

    @Test
    public void runEmptyArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] emptyArgs = {};
        int result = epubChecker.run(emptyArgs);
        assertEquals("Should return error code", 1, result);
    }

}