package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EpubCheckFactory;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.DefaultReportImpl;
import com.adobe.epubcheck.util.EPUBVersion;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Locale;

public class GeneratedRunDumpDictionaryTest {

    @Test
    public void runDumpDictionaryTest() {
        EpubChecker checker = new EpubChecker();
        Assert.assertEquals(0, checker.run(new String[]{"-mode", "dump-dict"}));
    }

}