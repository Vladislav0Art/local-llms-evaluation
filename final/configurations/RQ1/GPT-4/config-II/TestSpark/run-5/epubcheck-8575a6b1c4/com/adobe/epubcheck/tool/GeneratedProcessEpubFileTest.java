package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.Messages;
import org.junit.Test;

import java.io.File;
import java.util.Locale;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class GeneratedProcessEpubFileTest {

    @Test
    public void processEpubFileTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.processEpubFile(new String[]{"-help"});
        assertEquals(0, result);
    }

}