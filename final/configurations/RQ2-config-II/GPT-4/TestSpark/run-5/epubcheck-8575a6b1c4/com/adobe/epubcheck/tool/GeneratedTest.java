package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.EpubCheck;
import com.adobe.epubcheck.api.EpubCheckFactory;
import com.adobe.epubcheck.api.LocalizableReport;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.EPUBVersion;
import io.mola.galimatias.GalimatiasParseException;
import io.mola.galimatias.URL;
import com.adobe.epubcheck.tool.EpubChecker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;

import java.util.Locale;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void runEmptyArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.run(new String[0]);
        assertEquals(0, result);
    }

    @Test
    public void runWithArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.run(new String[]{"arg1", "arg2"});
        assertNotEquals(0, result);
    }

    @Test
    public void getLocaleEnTest() {
        EpubChecker ePubChecker = new EpubChecker();
        Locale result = ePubChecker.getLocale();
        assertEquals(Locale.ENGLISH, result);
    }

    @Test
    public void getLocaleNotEqTest() {
        EpubChecker ePubChecker = new EpubChecker();
        Locale result = ePubChecker.getLocale();
        assertNotEquals(Locale.FRENCH, result);
    }

    @Test
    public void validateFileTest() {
        EpubChecker epubChecker = new EpubChecker();
        Report mockReport = mock(Report.class);

        int result = epubChecker.validateFile("test.epub", EPUBVersion.VERSION_3, mockReport, EPUBProfile.EPUB_3);

        assertEquals(0, result);
    }

    @Test
    public void validateFileTest_invalid() {
        EpubChecker epubChecker = new EpubChecker();
        Report mockReport = mock(Report.class);

        int result = epubChecker.validateFile("test.epub", EPUBVersion.VERSION_3, mockReport, EPUBProfile.EPUB_3);

        assertNotEquals(1, result);
    }

    @Test
    public void processEpubFileValidTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.processEpubFile(new String[]{"test.epub"});
        assertEquals(0, result);
    }

    @Test
    public void processEpubFileInvalidTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.processEpubFile(new String[]{""});
        assertNotEquals(0, result);
    }

}