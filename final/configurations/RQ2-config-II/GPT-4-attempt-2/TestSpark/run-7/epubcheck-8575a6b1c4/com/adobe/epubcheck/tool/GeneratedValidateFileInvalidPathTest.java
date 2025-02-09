package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.MessageDictionaryDumper;
import com.adobe.epubcheck.util.DefaultReportImpl;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Locale;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedValidateFileInvalidPathTest {

    @Test
    public void validateFileInvalidPathTest() {
        EpubChecker epubChecker = new EpubChecker();
        Report report = new DefaultReportImpl("InvalidFilePath");
        int result = epubChecker.validateFile("InvalidFilePath", EPUBVersion.VERSION_2, report, EPUBProfile.DEFAULT);
        assertTrue("Should return value less than 0 for invalid file path", result < 0);
    }

}