package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedProcessEpubFile ProcessTest {

    @Test
    public void processEpubFile

    ProcessTest() throws Exception {
        String[] args = {"-f", "test.epub"};
        EpubChecker checker = Mockito.mock(EpubChecker.class);
        when(checker.processEpubFile(Mockito.anyString())).thenReturn(0);
        int result = checker.processEpubFile(args);
        assertEquals(0, result);
    }

}