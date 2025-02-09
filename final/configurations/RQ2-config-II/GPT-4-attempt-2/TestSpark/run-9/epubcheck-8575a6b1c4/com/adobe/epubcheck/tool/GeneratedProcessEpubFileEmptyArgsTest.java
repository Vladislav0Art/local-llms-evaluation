package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

import java.util.Locale;

public class GeneratedProcessEpubFileEmptyArgsTest {

    @Test
    public void processEpubFileEmptyArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {};
        epubChecker.processEpubFile(args);
    }

}