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

public class GeneratedTest {

    @Test
    public void getLocaleDefaultTest() {
        EpubChecker epubChecker = new EpubChecker();
        assertEquals("Locale should be default", Locale.getDefault(), epubChecker.getLocale());
    }

    @Test
    public void runNullArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        int statusCode = epubChecker.run(null);
        assertEquals("Status code should be -1 for null args", -1, statusCode);
    }

    @Test
    public void runEmptyArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        int statusCode = epubChecker.run(new String[]{});
        assertEquals("Status code should be -1 for empty args", -1, statusCode);
    }

    @Test
    public void processEpubFileNullArgsTest() {
        EpubChecker epubChecker = Mockito.spy(EpubChecker.class);
        int statusCode = epubChecker.processEpubFile(null);
        assertEquals("Status code should be -1 for null args", -1, statusCode);
    }

    @Test
    public void validateFileInvalidPathTest() {
        EpubChecker epubChecker = new EpubChecker();
        Report report = new DefaultReportImpl("InvalidFilePath");
        int result = epubChecker.validateFile("InvalidFilePath", EPUBVersion.VERSION_2, report, EPUBProfile.DEFAULT);
        assertTrue("Should return value less than 0 for invalid file path", result < 0);
    }

}