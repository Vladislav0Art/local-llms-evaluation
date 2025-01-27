package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedProcessEpubFile_ProcessesSingleFile {

    @Test
    public void processEpubFile_ProcessesSingleFile() {
        EpubChecker checker = new EpubChecker();
        when(checker.processSingleFile("test.zip", "content/epub", new String[]{"--validate"})).thenReturn(0);
        int result = checker.processEpubFile(new String[]{"--validate"});
        assertEquals(0, result);
    }

}