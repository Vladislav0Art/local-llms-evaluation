package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EpubCheck;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.InvalidVersionException;
import com.adobe.epubcheck.util.outWriter;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class GeneratedProcessFileTest {

    @Test
    public void processFileTest() {
        EpubChecker checker = new EpubChecker();
        Report report = new DefaultReportImpl("test.epub");
        checker.path = "src/test/resources/test.epub";

        int result = checker.processFile(report);

        assertEquals(0, result);
    }

}