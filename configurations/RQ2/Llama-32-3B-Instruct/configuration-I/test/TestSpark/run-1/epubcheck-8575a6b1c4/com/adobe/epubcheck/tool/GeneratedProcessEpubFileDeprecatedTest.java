package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;

import org.mockito.Mockito;
import org.junit.runner.RunWith;

public class GeneratedProcessEpubFileDeprecatedTest {

    @Mock
    private Locale locale;

    @Test
    public void processEpubFileDeprecatedTest() {
        // Not using mock for deprecated method
        File file = new File("test.txt");
        assertEquals(0, new EpubChecker().processEpubFile(file));
    }

}