package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import org.mockito.Mockito;

import java.io.File;
import java.io.IOException;
import java.util.Locale;

public class GeneratedTest {

    @Test
    public void runEmptyArgumentsTest() {
        EpubChecker epubChecker = new EpubChecker();
        int return_value = epubChecker.run(new String[]{});
        assertEquals(1, return_value);
    }

    @Test
    public void runWithArgumentsTest() {
        EpubChecker epubChecker = new EpubChecker();
        int return_value = epubChecker.run(new String[]{"-v", "2.0", "-m", "opf", "./test.epub"});
        assertEquals(0, return_value);
    }

    @Test
    public void processEpubFileTest() {
        EpubChecker epubChecker = new EpubChecker();
        int return_value = epubChecker.processEpubFile(new String[]{"./test.epub"});
        assertEquals(0, return_value);
    }

    @Test
    public void getLocaleTest() {
        EpubChecker epubChecker = new EpubChecker();
        assertTrue(epubChecker.getLocale() instanceof Locale);
    }

}