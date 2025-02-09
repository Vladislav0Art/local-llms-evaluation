package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.Messages;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Locale;

import static org.junit.Assert.*;

public class GeneratedValidateFileTest {

    @Test
    public void validateFileTest() {
        String path = "testPath";
        EPUBVersion version = EPUBVersion.VERSION_3;
        Report report = Mockito.mock(Report.class);
        EPUBProfile profile = EPUBProfile.DEFAULT;

        EpubChecker epubChecker = new EpubChecker();
        assertEquals(0, epubChecker.validateFile(path, version, report, profile));
    }

}