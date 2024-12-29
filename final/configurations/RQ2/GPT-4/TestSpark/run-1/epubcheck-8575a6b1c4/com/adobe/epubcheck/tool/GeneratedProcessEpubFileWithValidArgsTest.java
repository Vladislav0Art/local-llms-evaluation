package com.adobe.epubcheck.tool;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.spy;

import org.mockito.MockitoAnnotations.initMocks;

public class GeneratedProcessEpubFileWithValidArgsTest {

    private final EpubChecker epubChecker = new EpubChecker();

    @Test
    public void processEpubFileWithValidArgsTest() {
        assertEquals(0, epubChecker.processEpubFile(new String[]{"valid.epub", "valid-output.xml"}));
    }

}