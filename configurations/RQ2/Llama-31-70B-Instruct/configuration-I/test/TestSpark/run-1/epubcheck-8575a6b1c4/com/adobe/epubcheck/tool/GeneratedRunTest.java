package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedRunTest {

    @Test
    public void runTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = new String[]{"arg1", "arg2"};
        int result = epubChecker.run(args);
        assertTrue(result >= 0);
    }

}