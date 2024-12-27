package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

import org.mockito.Mockito;
import com.adobe.epubcheck.epub.EPUBProfile;
import com.adobe.epubcheck.epub.EPUBVersion;

public class GeneratedRunValidArgsTest {

    @Test
    public void runValidArgsTest() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"arg1", "arg2"};
        int result = checker.run(args);
        Assert.assertEquals(0, result);
    }

}