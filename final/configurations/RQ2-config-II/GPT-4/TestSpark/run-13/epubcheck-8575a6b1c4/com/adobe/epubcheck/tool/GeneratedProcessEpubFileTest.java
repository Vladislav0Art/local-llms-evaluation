package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.EPUBVersion;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Locale;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedProcessEpubFileTest {

    @Test
    public void processEpubFileTest() {
        String[] args = new String[]{"filename.epub"};
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.processEpubFile(args);
        assertEquals(1, result);
    }

}