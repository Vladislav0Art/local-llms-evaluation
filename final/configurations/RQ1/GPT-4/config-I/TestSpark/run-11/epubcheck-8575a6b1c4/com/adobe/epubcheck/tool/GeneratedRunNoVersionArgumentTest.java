package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.InvalidVersionException;
import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

public class GeneratedRunNoVersionArgumentTest {

    @Test
    public void runNoVersionArgumentTest() {
        String[] args = {"-v"};
        EpubChecker checker = new EpubChecker();
        checker.run(args);
    }

}