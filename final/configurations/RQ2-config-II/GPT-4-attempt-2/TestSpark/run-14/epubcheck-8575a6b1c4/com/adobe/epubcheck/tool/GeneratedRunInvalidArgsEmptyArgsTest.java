package com.adobe.epubcheck.tool;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.DefaultReportImpl;
import com.adobe.epubcheck.util.EPUBVersion;

public class GeneratedRunInvalidArgsEmptyArgsTest {

    @Test
    public void runInvalidArgsEmptyArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = new String[]{};
        int result = epubChecker.run(args);
        assertEquals("Result mismatched.", 1, result);
    }

}