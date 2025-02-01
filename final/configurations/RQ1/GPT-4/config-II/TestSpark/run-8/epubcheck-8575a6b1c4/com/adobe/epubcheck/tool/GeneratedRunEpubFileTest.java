package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EpubCheck;
import com.adobe.epubcheck.messages.MessageDictionary;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.Archive;
import com.adobe.epubcheck.util.DefaultReportImpl;
import com.adobe.epubcheck.util.Report;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.util.Locale;

public class GeneratedRunEpubFileTest {

    private EpubChecker epubChecker = new EpubChecker();

    @Test
    public void runEpubFileTest() {
        Report report = new DefaultReportImpl("sample.epub");
        epubChecker.setLocale(Locale.US);
        String[] args = new String[]{"", "sample.epub", ""};
        int result = epubChecker.run(args);

        Assert.assertEquals(0, result);
    }

}