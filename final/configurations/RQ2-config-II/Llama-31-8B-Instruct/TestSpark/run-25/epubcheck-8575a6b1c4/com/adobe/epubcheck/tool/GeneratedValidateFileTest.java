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
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.ReportingLevel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedValidateFileTest {

    @InjectMocks
    private EpubChecker epubChecker;

    @Mock
    private EpubCheckFactory epubCheckFactory;

    @Mock
    private Report report;

    @Mock
    private LocalizableReport localizableReport;

    @Test
    public void validateFileTest() {
        String path = "path/to/file.epub";
        EPUBVersion version = EPUBVersion.EPUB3;
        Report report = new DefaultReportImpl();
        EPUBProfile profile = new EPUBProfile();
        int result = epubChecker.validateFile(path, version, report, profile);
        assertEquals(0, result);
    }

}