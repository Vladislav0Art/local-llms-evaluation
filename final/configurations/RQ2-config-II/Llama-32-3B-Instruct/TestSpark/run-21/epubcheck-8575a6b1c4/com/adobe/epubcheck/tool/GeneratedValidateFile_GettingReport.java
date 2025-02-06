package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedValidateFile_GettingReport {

    @Mock
    private Locale locale;

    @Mock
    private FileResourceProvider fileResourceProvider;

    @Mock
    private URLResourceProvider urlResourceProvider;

    @Mock
    private Archive archive;

    private EpubChecker epubChecker = new EpubChecker();

    @Test
    public void validateFile_GettingReport() throws Exception {
        String path = "path";
        EPUBVersion version = EPUBVersion.EPUB3;
        Report report = new DefaultReportImpl();
        int result = epubChecker.validateFile(path, version, report, null);
        assertNotNull(report);
        assertEquals(0, result);
    }

}