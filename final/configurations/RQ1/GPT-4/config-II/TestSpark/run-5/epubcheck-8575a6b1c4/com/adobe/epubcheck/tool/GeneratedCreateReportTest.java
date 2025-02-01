package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.Messages;
import org.junit.Test;

import java.io.File;
import java.util.Locale;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class GeneratedCreateReportTest {

    @Test
    public void createReportTest() throws IOException {
        EpubChecker epubChecker = new EpubChecker();
        Report report = epubChecker.createReport();
        assertNotNull(report);
    }

}