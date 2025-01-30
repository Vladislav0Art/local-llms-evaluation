package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.DefaultReportImpl;
import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedRunWithInvalidArgsTest {

    @Test
    public void runWithInvalidArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        int expected = 1;
        String[] args = {"/invalid/path"};
        int actual = epubChecker.run(args);
        assertEquals(expected, actual);
    }

}