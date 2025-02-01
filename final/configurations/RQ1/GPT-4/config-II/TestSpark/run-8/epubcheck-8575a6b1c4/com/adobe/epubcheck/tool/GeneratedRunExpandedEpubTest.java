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

public class GeneratedRunExpandedEpubTest {

    private EpubChecker epubChecker = new EpubChecker();

    @Test
    public void runExpandedEpubTest() {
        String[] args = {"testDir", "-m", "exp"};
        EpubChecker epubChecker = new EpubChecker();

        int result = epubChecker.run(args);
        File file = new File("testDir");

        Assert.assertTrue(file.delete());
        Assert.assertEquals(0, result);
    }

}