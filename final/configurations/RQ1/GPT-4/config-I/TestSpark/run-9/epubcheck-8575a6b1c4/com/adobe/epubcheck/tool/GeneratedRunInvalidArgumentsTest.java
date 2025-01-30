package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.LocalizableReport;
import com.adobe.epubcheck.util.DefaultReportImpl;
import com.adobe.epubcheck.util.EPUBVersion;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Locale;

import static org.junit.Assert.*;

public class GeneratedRunInvalidArgumentsTest {

    @Test
    public void runInvalidArgumentsTest() {
        EpubChecker checker = new EpubChecker();

        String[] args = {"invalidArgument"};

        int returnVal = checker.run(args);

        assertEquals(1, returnVal);
    }

}