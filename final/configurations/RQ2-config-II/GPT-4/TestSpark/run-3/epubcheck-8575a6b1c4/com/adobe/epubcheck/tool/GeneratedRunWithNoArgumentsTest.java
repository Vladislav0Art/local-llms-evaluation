package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EpubCheckFactory;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.InvalidVersionException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedRunWithNoArgumentsTest {

    @Test
    public void runWithNoArgumentsTest() {
        EpubChecker checker = new EpubChecker();
        String[] args = {};
        int result = checker.run(args);
        Assert.assertEquals(-1, result);
    }

}