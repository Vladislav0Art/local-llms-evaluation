package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.DefaultReportImpl;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedValidateFileInvalidTest {

    @Test
    public void validateFileInvalidTest() {
        EpubChecker epubChecker = new EpubChecker();
        String path = "non_existing_file.epub";
        Report report = new DefaultReportImpl(path);
        int result = epubChecker.validateFile(path, EPUBVersion.VERSION_3_0, report, EPUBProfile.DEFAULT);
        assertEquals("Expected error validation of non-existing epub file", 1, result);
    }

}