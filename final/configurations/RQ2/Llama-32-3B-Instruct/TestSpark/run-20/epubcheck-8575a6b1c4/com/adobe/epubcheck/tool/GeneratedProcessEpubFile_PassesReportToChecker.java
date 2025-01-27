package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedProcessEpubFile_PassesReportToChecker {

    @Test
    public void processEpubFile_PassesReportToChecker() {
        EpubChecker checker = new EpubChecker();
        Report report = new DefaultReportImpl();
        when(checker.processSingleFile("test.zip", "content/epub", new String[]{"--validate"})).thenReturn(0);
        int result = checker.processEpubFile(new String[]{"--validate"}, report);
        assertEquals(0, result);
    }

}