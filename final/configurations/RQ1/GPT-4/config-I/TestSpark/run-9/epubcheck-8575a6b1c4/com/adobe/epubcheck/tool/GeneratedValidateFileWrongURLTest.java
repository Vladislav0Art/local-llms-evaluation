package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.LocalizableReport;
import com.adobe.epubcheck.util.DefaultReportImpl;
import com.adobe.epubcheck.util.EPUBVersion;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Locale;

import static org.junit.Assert.*;

public class GeneratedValidateFileWrongURLTest {

    @Test
    public void validateFileWrongURLTest() {
        EpubChecker checker = new EpubChecker();

        ByteArrayOutputStream errContent = new ByteArrayOutputStream();
        System.setErr(new PrintStream(errContent));

        int result = checker.validateFile("http://invalid.url", EPUBVersion.VERSION_3, null, null);

        assertEquals(1, result);
    }

}