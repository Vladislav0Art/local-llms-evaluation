package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.InvalidVersionException;
import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

public class GeneratedRunInvalidVersionTest {

    @Test
    public void runInvalidVersionTest() {
        String[] args = {"-v", "4.0"};
        EpubChecker checker = new EpubChecker();
        checker.run(args);
    }

}