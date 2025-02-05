package com.adobe.epubcheck.tool;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.util.EPUBVersion;

import java.util.Locale;

import org.mockito.Mockito;

public class GeneratedRunWithValidArgsTest {

    @Test
    public void runWithValidArgsTest() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"testFile", "en"};
        int result = checker.run(args);
        assertEquals(0, result);
    }

}