package com.adobe.epubcheck.tool;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.util.EPUBVersion;

import java.util.Locale;

import org.mockito.Mockito;

public class GeneratedRunWithInvalidArgsTest {

    @Test
    public void runWithInvalidArgsTest() {
        EpubChecker checker = new EpubChecker();
        String[] args = {};
        int result = checker.run(args);
        assertEquals(1, result);
    }

}