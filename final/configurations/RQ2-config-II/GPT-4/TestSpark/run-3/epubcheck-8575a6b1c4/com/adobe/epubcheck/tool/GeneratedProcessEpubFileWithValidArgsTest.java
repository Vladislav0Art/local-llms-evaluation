package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EpubCheckFactory;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.InvalidVersionException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedProcessEpubFileWithValidArgsTest {

    @Test
    public void processEpubFileWithValidArgsTest() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"path/to/file", "version"};
        int result = checker.processEpubFile(args);
        Assert.assertEquals(0, result);
    }

}