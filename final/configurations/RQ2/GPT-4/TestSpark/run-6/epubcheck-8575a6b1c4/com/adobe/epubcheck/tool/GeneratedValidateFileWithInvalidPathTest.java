package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.PrintStream;
import java.io.IOException;
import java.util.Locale;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.DefaultReportImpl;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.api.Report;

public class GeneratedValidateFileWithInvalidPathTest {

    @Test
    public void validateFileWithInvalidPathTest() {
        EpubChecker checker = new EpubChecker();
        Report report = new DefaultReportImpl("test");
        int result = checker.validateFile("/invalid/path", EPUBVersion.VERSION_3, report, EPUBProfile.DEFAULT);
        assertNotEquals(0, result);
    }

}