package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.InvalidVersionException;
import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

public class GeneratedRunValidVersionTest {

    @Test
    public void runValidVersionTest() {
        String[] args = {"-v", "3.0"};
        EpubChecker checker = new EpubChecker();
        int result = checker.run(args);
        Assert.assertEquals(1, result);
    }

}