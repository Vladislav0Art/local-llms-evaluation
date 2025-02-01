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

public class GeneratedRunNonExistentDirectoryTest {

    private EpubChecker epubChecker = new EpubChecker();

    @Test
    public void runNonExistentDirectoryTest() {
        String[] args = {"testNonExistentDir", "-m", "exp"};
        EpubChecker epubChecker = new EpubChecker();

        int result = epubChecker.run(args);
        Assert.assertEquals(1, result);
    }

}