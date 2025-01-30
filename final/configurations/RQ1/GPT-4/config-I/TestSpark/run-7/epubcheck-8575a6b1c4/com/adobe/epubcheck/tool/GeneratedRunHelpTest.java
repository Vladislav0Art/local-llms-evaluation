package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.InvalidVersionException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class GeneratedRunHelpTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void runHelpTest() {
        EpubChecker epubChecker = new EpubChecker();
        int returnValue = epubChecker.run(new String[]{"--help"});
        Assert.assertEquals(0, returnValue);
    }

}