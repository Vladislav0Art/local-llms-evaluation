package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.DefaultReportImpl;
import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedValidateFileTest {

    @Test
    public void validateFileTest() {
        EpubChecker epubChecker = new EpubChecker();
        int expected = 1;
        String path = "/invalid/path";
        int actual = epubChecker.validateFile(path, EPUBVersion.VERSION_2, new DefaultReportImpl(path), EPUBProfile.DEFAULT);
        assertEquals(expected, actual);
    }

}