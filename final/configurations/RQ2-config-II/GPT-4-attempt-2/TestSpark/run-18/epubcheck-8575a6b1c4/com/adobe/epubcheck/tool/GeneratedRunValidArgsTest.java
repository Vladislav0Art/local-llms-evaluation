package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.EpubCheck;
import com.adobe.epubcheck.opf.ValidationContext;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.Messages;
import com.adobe.epubcheck.util.DefaultReportImpl;
import com.adobe.epubcheck.util.FileResourceProvider;
import com.adobe.epubcheck.tool.EpubChecker;
import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

public class GeneratedRunValidArgsTest {

    @Test
    public void runValidArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = new String[]{"arg1", "arg2"};
        Assert.assertEquals(0, epubChecker.run(args));
    }

}