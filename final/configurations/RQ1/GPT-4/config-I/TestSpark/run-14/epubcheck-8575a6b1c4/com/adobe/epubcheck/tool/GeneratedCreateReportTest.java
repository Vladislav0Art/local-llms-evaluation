package com.adobe.epubcheck.tool;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.mockito.Mockito;
import io.mola.galimatias.URL;
import org.w3c.epubcheck.core.Checker;

public class GeneratedCreateReportTest {

    @Test
    public void createReportTest() throws IOException {
        EpubChecker epubChecker = new EpubChecker();
        Report report = epubChecker.createReport();
        assertNotNull(report);
    }

}