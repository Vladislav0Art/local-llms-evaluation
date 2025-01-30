package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.InvalidVersionException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class GeneratedProcessEpubFileTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void processEpubFileTest() {
        EpubChecker epubChecker = new EpubChecker();
        int returnValue = epubChecker.processEpubFile(new String[]{"--help"});
        Assert.assertEquals(0, returnValue);
    }

}