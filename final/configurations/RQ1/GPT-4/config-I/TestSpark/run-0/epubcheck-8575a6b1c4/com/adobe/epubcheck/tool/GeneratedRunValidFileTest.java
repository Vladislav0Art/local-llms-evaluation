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
public class GeneratedRunValidFileTest {

    @Test
    public void runValidFileTest() {
        // Assuming a valid ePub file named "valid.epub" is present in the resources folder
        InputStream inputStream = getClass().getResourceAsStream("/valid.epub");
        assertNotNull("Test file missing", inputStream);

        EpubChecker checker = new EpubChecker();
        String[] args = {"-mode", "exp", "-s", "-o", "-json", "valid.epub"};
        int result = checker.run(args);
        assertEquals("EpubChecker should return 0 when a valid ePub is processed", 0, result);
    }

}