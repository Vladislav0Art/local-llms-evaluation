package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.io.IOException;
import java.io.File;
import java.util.Locale;

public class GeneratedProcessArgumentsNoFileTest {

    @Test
    public void processArgumentsNoFileTest() {
        EpubChecker epubChecker = new EpubChecker();
        assertFalse(epubChecker.processArguments(new String[]{}));
    }

}