package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EpubCheck;
import com.adobe.epubcheck.api.EpubCheckFactory;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.FileResourceProvider;
import com.adobe.epubcheck.util.InvalidVersionException;
import com.adobe.epubcheck.util.Messages;
import com.adobe.epubcheck.util.OPSType;
import com.adobe.epubcheck.util.URLResourceProvider;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Locale;

import static org.mockito.Mockito.*;

public class GeneratedValidateFileNonExistingFileTest {

    @Test
    public void validateFileNonExistingFileTest() {
        EpubChecker epubChecker = new EpubChecker();
        Report mockReport = mock(Report.class);
        int result = epubChecker.validateFile("non-existing-path", EPUBVersion.VERSION_3, mockReport, EPUBProfile.DEFAULT);
        verify(mockReport).message(anyString(), anyObject());
        Assert.assertEquals(1, result);
    }

}