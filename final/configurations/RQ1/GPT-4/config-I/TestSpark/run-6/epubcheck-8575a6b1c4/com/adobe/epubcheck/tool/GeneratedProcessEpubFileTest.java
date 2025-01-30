package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import org.mockito.Mockito;

import java.io.File;
import java.io.IOException;
import java.util.Locale;

public class GeneratedProcessEpubFileTest {

    @Test
    public void processEpubFileTest() {
        EpubChecker epubChecker = new EpubChecker();
        int return_value = epubChecker.processEpubFile(new String[]{"./test.epub"});
        assertEquals(0, return_value);
    }

}