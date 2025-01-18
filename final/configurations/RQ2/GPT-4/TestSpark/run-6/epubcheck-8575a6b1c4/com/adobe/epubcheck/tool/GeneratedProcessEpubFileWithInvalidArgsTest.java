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

public class GeneratedProcessEpubFileWithInvalidArgsTest {

    @Test
    public void processEpubFileWithInvalidArgsTest() {
        EpubChecker checker = new EpubChecker();
        int result = checker.processEpubFile(new String[]{"-invalid"});
        assertNotEquals(0, result);
    }

}