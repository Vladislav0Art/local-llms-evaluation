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

public class GeneratedTest {

    @Test
    public void getLocaleTest() {
        EpubChecker checker = new EpubChecker();
        assertEquals(Locale.getDefault(), checker.getLocale());
    }

    @Test
    public void runValidArgsTest() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"input", "--profile", "default"};
        assertEquals(0, checker.run(args));
    }

    @Test
    public void runInvalidArgsTest() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"invalid", "--profile", "default"};
        assertEquals(1, checker.run(args));
    }

    @Test
    public void runWithNullArgsTest() {
        EpubChecker checker = new EpubChecker();
        assertEquals(1, checker.run(null));
    }

    @Test
    public void processEpubFileValidArgsTest() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"input", "--profile", "default"};
        assertEquals(0, checker.processEpubFile(args));
    }

    @Test
    public void processEpubFileInvalidArgsTest() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"invalid", "--profile", "default"};
        assertEquals(1, checker.processEpubFile(args));
    }

    @Test
    public void processEpubFileWithNullArgsTest() {
        EpubChecker checker = new EpubChecker();
        assertEquals(1, checker.processEpubFile(null));
    }

    @Test
    public void validateFileTest() {
        EpubChecker checker = new EpubChecker();
        Report mockReport = mock(Report.class);
        assertEquals(0, checker.validateFile("valid_path", EPUBVersion.VERSION_3, mockReport, EPUBProfile.DEFAULT));
    }

    @Test
    public void validateFileInvalidPathTest() {
        EpubChecker checker = new EpubChecker();
        Report mockReport = mock(Report.class);
        assertEquals(1, checker.validateFile("invalid_path", EPUBVersion.VERSION_3, mockReport, EPUBProfile.DEFAULT));
    }

    @Test
    public void validateFileNullPathTest() {
        EpubChecker checker = new EpubChecker();
        Report mockReport = mock(Report.class);
        assertEquals(1, checker.validateFile(null, EPUBVersion.VERSION_3, mockReport, EPUBProfile.DEFAULT));
    }

}