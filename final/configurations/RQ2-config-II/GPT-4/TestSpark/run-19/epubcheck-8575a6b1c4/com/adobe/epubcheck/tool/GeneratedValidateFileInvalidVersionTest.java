package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.InvalidVersionException;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.io.File;
import java.util.Locale;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedValidateFileInvalidVersionTest {

    @Test
    public void validateFileInvalidVersionTest() {
        EpubChecker epubChecker = new EpubChecker();
        Report report = mock(Report.class);
        epubChecker.validateFile("path", null, report, EPUBProfile.DEFAULT);
    }

}