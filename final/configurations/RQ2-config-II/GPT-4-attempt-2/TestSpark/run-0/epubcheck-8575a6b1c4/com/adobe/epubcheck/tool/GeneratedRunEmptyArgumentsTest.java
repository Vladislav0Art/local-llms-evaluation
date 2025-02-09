package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.DefaultReportImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

public class GeneratedRunEmptyArgumentsTest {

    @Test
    public void runEmptyArgumentsTest() {
        EpubChecker checker = new EpubChecker();
        int expected = 0;
        int actual = checker.run(new String[]{});
        Assert.assertEquals(expected, actual);
    }

}