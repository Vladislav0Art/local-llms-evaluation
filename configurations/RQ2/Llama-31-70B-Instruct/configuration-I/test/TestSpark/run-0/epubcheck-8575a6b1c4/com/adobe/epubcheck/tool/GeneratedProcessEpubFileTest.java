package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedProcessEpubFileTest {

    @Test
    public void processEpubFileTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = new String[]{"arg1", "arg2"};
        int result = epubChecker.processEpubFile(args);
        assertTrue(result >= 0);
    }

}