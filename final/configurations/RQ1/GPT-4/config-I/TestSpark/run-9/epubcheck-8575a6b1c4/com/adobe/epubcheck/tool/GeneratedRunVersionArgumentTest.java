package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.LocalizableReport;
import com.adobe.epubcheck.util.DefaultReportImpl;
import com.adobe.epubcheck.util.EPUBVersion;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Locale;

import static org.junit.Assert.*;

public class GeneratedRunVersionArgumentTest {

    @Test
    public void runVersionArgumentTest() {
        EpubChecker checker = new EpubChecker();
        final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

        System.setErr(new PrintStream(errContent));

        String[] args = {"--version"};

        int returnVal = checker.run(args);

        assertTrue(errContent.toString().trim().length() == 0);
        assertEquals(0, returnVal);
    }

}