package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.DefaultReportImpl;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.File;
import java.io.IOException;
import java.util.Locale;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class GeneratedValidateFileTestWithInvalidPath {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void validateFileTestWithInvalidPath() {
        EpubChecker checker = new EpubChecker();
        Report report = new DefaultReportImpl("filename");
        int result = checker.validateFile("invalid path", null, report, EPUBProfile.DEFAULT);
        assertEquals(-1, result);
    }

}