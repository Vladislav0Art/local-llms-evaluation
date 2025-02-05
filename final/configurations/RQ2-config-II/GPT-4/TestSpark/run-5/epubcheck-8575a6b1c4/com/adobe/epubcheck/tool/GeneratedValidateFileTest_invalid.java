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
public class GeneratedValidateFileTest_invalid {

    @Test
    public void validateFileTest_invalid() {
        EpubChecker epubChecker = new EpubChecker();
        Report mockReport = mock(Report.class);

        int result = epubChecker.validateFile("test.epub", EPUBVersion.VERSION_3, mockReport, EPUBProfile.EPUB_3);

        assertNotEquals(1, result);
    }

}