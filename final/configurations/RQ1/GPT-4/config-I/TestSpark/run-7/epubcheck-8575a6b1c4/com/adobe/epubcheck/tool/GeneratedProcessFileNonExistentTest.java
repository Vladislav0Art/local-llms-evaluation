package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.InvalidVersionException;
import com.adobe.epubcheck.util.Messages;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class GeneratedProcessFileNonExistentTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void processFileNonExistentTest() {
        EpubChecker epubChecker = new EpubChecker();
        int returnValue = epubChecker.processFile(null);
        Assert.assertEquals(1, returnValue);
    }

}