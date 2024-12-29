package com.adobe.epubcheck.tool;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.spy;

import org.mockito.MockitoAnnotations.initMocks;

public class GeneratedProcessEpubFileWithNullArgsTest {

    private final EpubChecker epubChecker = new EpubChecker();

    @Test
    public void processEpubFileWithNullArgsTest() {
        epubChecker.processEpubFile(new String[]{null});
    }

}