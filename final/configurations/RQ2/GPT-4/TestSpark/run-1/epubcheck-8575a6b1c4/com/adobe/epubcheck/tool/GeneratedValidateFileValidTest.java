package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.adobe.epubcheck.api.Report;

import java.io.IOException;
import java.util.Locale;

import com.adobe.epubcheck.util.InvalidVersionException;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.DefaultReportImpl;
import org.mockito.Mockito;

public class GeneratedValidateFileValidTest {

    EpubChecker epubChecker = new EpubChecker();

    @Test
    public void validateFileValidTest() throws IOException, InvalidVersionException {
        String path = "test.epub";
        EPUBVersion version = EPUBVersion.VERSION_2;
        Report report = new DefaultReportImpl(path);
        EPUBProfile profile = EPUBProfile.DEFAULT;
        assertTrue(epubChecker.validateFile(path, version, report, profile) >= 0);
    }

}