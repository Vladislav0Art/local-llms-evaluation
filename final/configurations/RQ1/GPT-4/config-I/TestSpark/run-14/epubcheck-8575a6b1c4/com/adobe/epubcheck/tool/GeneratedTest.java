package com.adobe.epubcheck.tool;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;

import org.junit.Test;
import org.mockito.Mockito;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.EpubCheck;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.DefaultReportImpl;
import com.adobe.epubcheck.util.EPUBVersion;

public class GeneratedTest {

    @Test
    public void runInvalidArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.run(new String[]{});
        assertEquals(1, result);
    }

    @Test
    public void validateFileURLTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.validateFile("https://randomurl.epub", EPUBVersion.VERSION_3, Mockito.mock(Report.class), EPUBProfile.DEFAULT);
        assertEquals(1, result);
    }

    @Test
    public void validateFileLocalTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.validateFile("../randompath.epub", EPUBVersion.VERSION_3, Mockito.mock(Report.class), EPUBProfile.DEFAULT);
        assertEquals(1, result);
    }

    @Test
    public void getLocaleTest() {
        EpubChecker epubChecker = new EpubChecker();
        assertNotNull(epubChecker.getLocale());
    }

    @Test
    public void runValidArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.run(new String[]{"src/test/resources/valid.epub"});
        assertEquals(0, result);
    }

    @Test
    public void processEpubFileTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.processEpubFile(new String[]{"src/test/resources/valid.epub"});
        assertEquals(0, result);
    }

}