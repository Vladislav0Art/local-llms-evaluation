package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.util.InvalidVersionException;
import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;
import java.util.regex.Pattern;

public class GeneratedProcessArgumentsInvalidTest {

    @Test
    public void processArgumentsInvalidTest() {
        String[] args = {"invalid_arg"};

        EpubChecker checker = new EpubChecker();
        boolean result = checker.processArguments(args);

        Assert.assertFalse(result);
    }

}