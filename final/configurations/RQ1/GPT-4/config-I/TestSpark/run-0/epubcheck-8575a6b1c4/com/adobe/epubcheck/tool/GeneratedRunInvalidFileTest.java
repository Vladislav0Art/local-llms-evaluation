package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.*;
import com.adobe.epubcheck.util.*;
import com.adobe.epubcheck.tool.EpubChecker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.*;
import java.lang.reflect.Method;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRunInvalidFileTest {

    @Test
    public void runInvalidFileTest() {
        // Assumes an invalid ePub file named "invalid.epub" is present in the resources folder
        InputStream inputStream = getClass().getResourceAsStream("/invalid.epub");
        assertNotNull("Test file missing", inputStream);

        EpubChecker checker = new EpubChecker();
        String[] args = {"-mode", "exp", "-s", "-o", "-json", "invalid.epub"};
        int result = checker.run(args);
        assertTrue("EpubChecker should return non-zero when an invalid ePub is processed", result != 0);
    }

}