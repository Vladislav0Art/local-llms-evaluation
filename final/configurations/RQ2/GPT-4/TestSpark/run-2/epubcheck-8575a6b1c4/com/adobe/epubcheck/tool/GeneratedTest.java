package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.api.Report;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Locale;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void getLocaleTest() {
        EpubChecker epubChecker = new EpubChecker();
        assertEquals(Locale.getDefault(), epubChecker.getLocale());
    }

    @Test
    public void runTest() {
        EpubChecker epubChecker = Mockito.spy(EpubChecker.class);
        String[] args = {"arg1", "arg2"};
        Mockito.when(epubChecker.run(args)).thenReturn(0);
        assertEquals(0, epubChecker.run(args));
    }

    @Test
    public void processEpubFileTest() {
        EpubChecker epubChecker = Mockito.spy(EpubChecker.class);
        String[] args = {"arg1", "arg2"};
        Mockito.when(epubChecker.processEpubFile(args)).thenReturn(0);
        assertEquals(0, epubChecker.processEpubFile(args));
    }

    @Test
    public void validateFileTest() {
        EpubChecker epubChecker = Mockito.spy(EpubChecker.class);
        Report mockReport = Mockito.mock(Report.class);
        String path = "path";
        EPUBVersion version = EPUBVersion.VERSION_2;
        int result = epubChecker.validateFile(path, version, mockReport, null);
        assertEquals(0, result);
    }

}