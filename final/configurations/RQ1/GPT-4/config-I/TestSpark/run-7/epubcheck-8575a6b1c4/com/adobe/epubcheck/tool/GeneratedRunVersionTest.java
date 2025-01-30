package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.InvalidVersionException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class GeneratedRunVersionTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void runVersionTest() {
        EpubChecker epubChecker = new EpubChecker();
        int returnValue = epubChecker.run(new String[]{"--version"});
        Assert.assertEquals(0, returnValue);
    }

}