package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.LocalizableReport;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.ReportingLevel;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

import static org.mockito.Mockito.*;

public class GeneratedValidateFileIfPathIsNullTest {

    @Test
    public void validateFileIfPathIsNullTest() {
        EpubChecker checker = new EpubChecker();
        String path = null;
        EPUBVersion version = EPUBVersion.VERSION_3;
        LocalizableReport report = mock(LocalizableReport.class);
        EPUBProfile profile = EPUBProfile.DEFAULT;

        Assert.assertEquals(0, checker.validateFile(path, version, report, profile));
    }

}