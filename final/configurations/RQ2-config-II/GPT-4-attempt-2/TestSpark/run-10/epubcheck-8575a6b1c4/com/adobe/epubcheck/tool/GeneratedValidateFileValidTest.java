package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.DefaultReportImpl;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedValidateFileValidTest {

    @Test
    public void validateFileValidTest() {
        EpubChecker epubChecker = new EpubChecker();
        String path = "test.epub";
        Report report = new DefaultReportImpl(path);
        int result = epubChecker.validateFile(path, EPUBVersion.VERSION_3_0, report, EPUBProfile.DEFAULT);
        assertEquals("Expected success validation of epub file", 0, result);
    }

}