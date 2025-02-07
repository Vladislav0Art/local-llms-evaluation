package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.EpubCheck;
import com.adobe.epubcheck.api.EpubCheckFactory;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.api.LocalizableReport;
import com.adobe.epubcheck.api.ReportingLevel;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.FileResourceProvider;
import com.adobe.epubcheck.util.GenericResourceProvider;
import com.adobe.epubcheck.util.URLResourceProvider;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @InjectMocks
    private EpubChecker epubChecker;

    @Test
    public void getLocaleTest() {
        Locale locale = epubChecker.getLocale();
        assertNotNull(locale);
    }

    @Test
    public void runTest() {
        String[] args = new String[0];
        int result = epubChecker.run(args);
        assertEquals(0, result);
    }

    @Test
    public void processEpubFileTest() {
        String[] args = new String[0];
        int result = epubChecker.processEpubFile(args);
        assertEquals(0, result);
    }

    @Test
    public void validateFileTest() {
        String path = "path/to/file.epub";
        EPUBVersion version = EPUBVersion.EPUB_3;
        Report report = new DefaultReportImpl();
        EPUBProfile profile = new EPUBProfile();
        int result = epubChecker.validateFile(path, version, report, profile);
        assertEquals(0, result);
    }

}