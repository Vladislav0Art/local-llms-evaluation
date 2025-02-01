package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.io.IOException;
import java.io.File;
import java.util.Locale;

public class GeneratedProcessArgumentsTest {

    @Test
    public void processArgumentsTest() {
        EpubChecker epubChecker = new EpubChecker();
        assertTrue(epubChecker.processArguments(new String[]{"test.epub"}));
    }

}