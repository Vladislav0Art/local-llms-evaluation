package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.LocalizableReport;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.DefaultReportImpl;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

import java.io.File;
import java.io.IOException;
import java.util.Locale;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    @Mock
    private Report report;

    @Test
    public void getLocaleTest() {
        EpubChecker epubChecker = new EpubChecker();
        Locale locale = epubChecker.getLocale();
        assertEquals(locale, Locale.getDefault());
    }

    @Test
    public void runValidArgsTest() {
        String[] args = {"arg1", "arg2"};
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.run(args);
        assertEquals(result, 0);
    }

    @Test
    public void runInvalidArgsTest() {
        String[] args = {};
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.run(args);
        assertEquals(result, 1);
    }

    @Test
    public void processEpubFileValidArgsTest() {
        String[] args = {"arg1", "arg2"};
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.processEpubFile(args);
        assertEquals(result, 0);
    }

    @Test
    public void processEpubFileInvalidArgsTest() {
        String[] args = {};
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.processEpubFile(args);
        assertEquals(result, 1);
    }

    @Test
    public void validateFileTest() {
        EpubChecker epubChecker = new EpubChecker();
        String path = folder.getRoot().getPath() + "test.epub";
        EPUBVersion version = EPUBVersion.VERSION_2;
        Report report = new DefaultReportImpl("test");
        EPUBProfile profile = EPUBProfile.DEFAULT;

        int result = epubChecker.validateFile(path, version, report, profile);
        assertEquals(result, 0);
    }

}