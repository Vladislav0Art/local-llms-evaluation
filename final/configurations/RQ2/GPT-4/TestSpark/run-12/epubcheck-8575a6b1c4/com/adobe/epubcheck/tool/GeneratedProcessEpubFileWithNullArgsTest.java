package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.Messages;
import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class GeneratedProcessEpubFileWithNullArgsTest {

    @Test
    public void processEpubFileWithNullArgsTest() {
        EpubChecker checker = new EpubChecker();
        assertEquals(1, checker.processEpubFile(null));
    }

}