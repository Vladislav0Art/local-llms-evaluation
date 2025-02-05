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
public class GeneratedValidateFileValidPathTest {

    @Test
    public void validateFileValidPathTest() {
        EpubChecker epubChecker = new EpubChecker();
        EPUBVersion version = EPUBVersion.VERSION_3;
        Report report = Mockito.mock(Report.class);
        EPUBProfile profile = EPUBProfile.DEFAULT;

        int result = epubChecker.validateFile("valid/path", version, report, profile);

        // Assuming successful validation returns 1
        assertEquals(1, result);
    }

}