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

public class GeneratedValidateFileValidEpubFileTest {

    @Test
    public void validateFileValidEpubFileTest() throws IOException, InvalidVersionException {
        EpubCheckFactory mockFactory = mock(EpubCheckFactory.class);
        EpubCheck mockCheck = mock(EpubCheck.class);

        when(mockFactory.createEpubCheck(any(File.class), any(Report.class), any(EPUBVersion.class)))
                .thenReturn(mockCheck);
        when(mockCheck.doValidate()).thenReturn(true);

        EpubChecker epubChecker = new EpubChecker(mockFactory);
        Report mockReport = mock(Report.class);

        File tempFile = File.createTempFile("testFile", ".epub");
        tempFile.deleteOnExit();

        int result = epubChecker.validateFile(tempFile.getAbsolutePath(), EPUBVersion.VERSION_3, mockReport, EPUBProfile.DEFAULT);
        verify(mockReport, never()).message(anyString(), anyObject());
        Assert.assertEquals(0, result);
    }

}