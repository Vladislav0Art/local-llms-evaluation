package com.adobe.epubcheck.tool;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.EPUBVersion;

import java.util.Locale;

public class GeneratedValidateFileExistingButNotValidTest {

    @Test
    public void validateFileExistingButNotValidTest() {
        EpubChecker epubChecker = new EpubChecker();
        String path = "./src/test/resources/invalid.epub";
        // Assume file 'invalid.epub' exists in the given path and is an invalid epub file
        EPUBVersion version = EPUBVersion.VERSION_2;
        Report reportMock = Mockito.mock(Report.class);
        EPUBProfile profile = EPUBProfile.DEFAULT;

        int status = epubChecker.validateFile(path, version, reportMock, profile);
        Assert.assertEquals("Validating invalid file should return failure status (-1).", -1, status);
        verify(reportMock, times(1)).message(anyString(), anyString(), anyString(), anyString(), anyString());
    }

}