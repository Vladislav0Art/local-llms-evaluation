package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.Messages;
import org.junit.Test;

import java.io.File;
import java.util.Locale;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class GeneratedProcessArgumentsInvalidTest {

    @Test
    public void processArgumentsInvalidTest() {
        EpubChecker epubChecker = new EpubChecker();
        boolean result = epubChecker.processArguments(new String[]{});
        assertEquals(false, result);
    }

}