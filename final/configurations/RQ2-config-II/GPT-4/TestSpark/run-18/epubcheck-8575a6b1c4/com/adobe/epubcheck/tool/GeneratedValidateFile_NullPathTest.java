package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.DefaultReportImpl;
import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.assertEquals;

public class GeneratedValidateFile_NullPathTest {

    @Test
    public void validateFile_NullPathTest() {
        EpubChecker epubChecker = new EpubChecker();
        String nullPath = null;
        Report report = new DefaultReportImpl(nullPath);
        epubChecker.validateFile(nullPath, EPUBVersion.VERSION_3_0, report, EPUBProfile.DEFAULT);
    }

}