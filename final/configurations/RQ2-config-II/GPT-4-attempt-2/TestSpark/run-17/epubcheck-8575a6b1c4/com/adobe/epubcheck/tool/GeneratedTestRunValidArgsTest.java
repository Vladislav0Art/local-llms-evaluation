package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.DefaultReportImpl;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Locale;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTestRunValidArgsTest {

    @Mock
    private Report report;

    @Test
    public void testRunValidArgsTest() {
        String[] args = {"-v"};
        EpubChecker checker = new EpubChecker();
        int exitCode = checker.run(args);
        assertEquals(0, exitCode);
    }

}