package com.adobe.epubcheck.tool;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.File;
import java.io.IOException;
import java.util.Locale;

import org.junit.Test;
import org.w3c.epubcheck.api.EPUBProfile;
import org.w3c.epubcheck.api.EpubCheck;
import org.w3c.epubcheck.api.Report;
import org.w3c.epubcheck.util.EPUBVersion;

public class GeneratedTestValidateFile {

    @Test
    public void testValidateFile() throws IOException {
        EpubChecker epubChecker = new EpubChecker();
        String path = "test.epub";
        EPUBVersion version = EPUBVersion.VERSION_3;
        Report report = mock(Report.class);
        EPUBProfile profile = EPUBProfile.DEFAULT;
        int result = epubChecker.validateFile(path, version, report, profile);
        assertEquals(0, result);
    }

}