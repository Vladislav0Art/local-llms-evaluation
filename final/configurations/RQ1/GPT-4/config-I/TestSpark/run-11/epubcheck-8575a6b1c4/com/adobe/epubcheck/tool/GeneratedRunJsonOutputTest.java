package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.InvalidVersionException;
import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

public class GeneratedRunJsonOutputTest {

    @Test
    public void runJsonOutputTest() {
        String[] args = {"-j", "-"};
        EpubChecker checker = new EpubChecker();
        int result = checker.run(args);
        Assert.assertEquals(1, result);
    }

}