package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Locale;

import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.tool.EpubChecker;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    Report report;

    @Test
    public void getLocaleTest() {
        EpubChecker epubChecker = new EpubChecker();
        Locale defaultLocale = Locale.getDefault();
        assertEquals(defaultLocale, epubChecker.getLocale());
    }

    @Test
    public void runWithValidArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {"arg1", "arg2"};
        int result = epubChecker.run(args);
        assertEquals(0, result);
    }

    @Test
    public void runWithNoArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = new String[0];
        int result = epubChecker.run(args);
        assertEquals(1, result);
    }

    @Test
    public void processEpubFileWithValidArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {"arg1", "arg2"};
        int result = epubChecker.processEpubFile(args);
        assertEquals(0, result);
    }

    @Test
    public void processEpubFileWithNoArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = new String[0];
        int result = epubChecker.processEpubFile(args);
        assertEquals(1, result);
    }

    @Test
    public void validateFileWithValidArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String path = "validPath";
        EPUBVersion version = EPUBVersion.VERSION_3_0;
        EPUBProfile profile = EPUBProfile.DEFAULT;
        int result = epubChecker.validateFile(path, version, report, profile);
        assertEquals(0, result);
    }

    @Test
    public void validateFileWithInvalidArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String path = "inValidPath";
        EPUBVersion version = EPUBVersion.VERSION_3_0;
        EPUBProfile profile = EPUBProfile.DEFAULT;
        int result = epubChecker.validateFile(path, version, report, profile);
        assertEquals(1, result);
    }

}