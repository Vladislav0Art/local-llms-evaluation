package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EpubCheckFactory;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.messages.MessageDictionaryDumper;
import com.adobe.epubcheck.opf.OPFChecker;
import com.adobe.epubcheck.opf.OPFChecker30;
import com.adobe.epubcheck.ops.OPSChecker;
import com.adobe.epubcheck.overlay.OverlayChecker;
import com.adobe.epubcheck.nav.NavChecker;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.Archive;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.FileResourceProvider;
import com.adobe.epubcheck.util.OPSType;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.File;

public class GeneratedTest {

    @Test
    public void runFileNotFoundTest() {
        EpubChecker epubChecker = new EpubChecker();
        // When the file doesn't exist the run method will return 1
        assertEquals(1, epubChecker.run(new String[]{"nonExistentFile.epub"}));
    }

    @Test
    public void runHelpTest() {
        EpubChecker epubChecker = new EpubChecker();
        // When the help flag is passed the run method will not return an error
        assertEquals(0, epubChecker.run(new String[]{"-help"}));
    }

    @Test
    public void runVersionTest() {
        EpubChecker epubChecker = new EpubChecker();
        // When the version flag is passed the run method will not return an error
        assertEquals(0, epubChecker.run(new String[]{"-version"}));
    }

    @Test
    public void validateFileNotFoundTest() {
        EpubChecker epubChecker = new EpubChecker();
        Report reportMock = mock(Report.class);
        // When the file doesn't exist the validateFile method will return 1
        assertEquals(1, epubChecker.validateFile("nonExistentFile.epub", EPUBVersion.VERSION_3, reportMock, null));
    }

    @Test
    public void processFileWithExpandedTest() {
        EpubChecker epubChecker = new EpubChecker();
        epubChecker.expanded = true;
        epubChecker.path = "non_existing_directory";
        Report reportMock = mock(Report.class);
        // Should return 1 cause the directory doesn't exist
        assertEquals(1, epubChecker.processFile(reportMock));
    }

    @Test
    public void getLocaleTest() {
        EpubChecker epubChecker = new EpubChecker();
        assertEquals(Locale.getDefault(), epubChecker.getLocale());
    }

}