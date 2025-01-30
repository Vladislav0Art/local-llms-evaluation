package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.InvalidVersionException;
import com.adobe.epubcheck.util.Messages;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class GeneratedProcessArgumentsNoFileProvidedTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void processArgumentsNoFileProvidedTest() {
        EpubChecker epubChecker = new EpubChecker();
        boolean returnValue = epubChecker.processArguments(new String[]{"-v", "3.0"});
        Assert.assertFalse(returnValue);
    }

}