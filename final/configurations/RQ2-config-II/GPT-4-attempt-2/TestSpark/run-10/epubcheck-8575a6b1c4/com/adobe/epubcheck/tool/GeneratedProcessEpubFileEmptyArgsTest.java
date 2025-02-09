package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.DefaultReportImpl;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedProcessEpubFileEmptyArgsTest {

    @Test
    public void processEpubFileEmptyArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = new String[0];
        int result = epubChecker.processEpubFile(args);
        assertEquals("Expected error processing epub file with empty args", 1, result);
    }

}