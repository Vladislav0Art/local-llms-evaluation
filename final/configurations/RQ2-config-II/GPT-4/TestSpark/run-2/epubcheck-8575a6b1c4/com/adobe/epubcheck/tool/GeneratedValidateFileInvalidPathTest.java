package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.api.EPUBProfile;
import org.mockito.Mockito;

import java.util.Locale;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class GeneratedValidateFileInvalidPathTest {

    @Test
    public void validateFileInvalidPathTest() {
        EpubChecker epubChecker = new EpubChecker();
        EPUBVersion version = EPUBVersion.VERSION_3;
        Report report = Mockito.mock(Report.class);
        EPUBProfile profile = EPUBProfile.DEFAULT;

        epubChecker.validateFile("invalid/path", version, report, profile);
    }

}