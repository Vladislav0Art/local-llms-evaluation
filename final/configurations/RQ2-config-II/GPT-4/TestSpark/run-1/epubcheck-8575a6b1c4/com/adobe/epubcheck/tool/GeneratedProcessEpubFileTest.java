package com.adobe.epubcheck.tool;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.util.EPUBVersion;

import java.util.Locale;

import org.mockito.Mockito;

public class GeneratedProcessEpubFileTest {

    @Test
    public void processEpubFileTest() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"testFile", "EPUB_3", "profile"};
        int result = checker.processEpubFile(args);
        assertEquals(0, result);
    }

}