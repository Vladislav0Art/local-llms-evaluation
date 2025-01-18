package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.DefaultReportImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

public class GeneratedRunTestWithNullArgs {

    @Test
    public void runTestWithNullArgs() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.run(null);
        Assert.assertEquals(-1, result);
    }

}