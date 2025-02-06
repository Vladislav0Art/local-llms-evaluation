package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

public class GeneratedTest {

    @Test
    public void getLocale_test() {
        Locale locale = new Locale("en", "US");
        assertEquals(locale, new EpubChecker().getLocale());
    }

    @Test
    public void run_test() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new outWriter(outContent));
        String[] args = {"path/to/epub/file.epub"};
        int result = new EpubChecker().run(args);
        assertTrue(result >= 0);
    }

    @Test
    public void run_invalidArgs_test() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new outWriter(outContent));
        String[] args = {" invalid", "args"};
        int result = new EpubChecker().run(args);
        assertTrue(result >= 0);
    }

    @Test
    public void getLocale_none_test() {
        assertNull(new EpubChecker().getLocale());
    }

    @Test
    public void validateFile_test() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new outWriter(outContent));
        String path = "path/to/epub/file.epub";
        int result = new EpubChecker().validateFile(path, EPUBVersion.VERSION_3, new Report(), new EPUBProfile());
        assertTrue(result >= 0);
    }

    @Test
    public void validateFile_invalidArgs_test() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new outWriter(outContent));
        String path = "path/to/epub/file.epub";
        int result = new EpubChecker().validateFile(path, null, new Report(), new EPUBProfile());
        assertTrue(result >= 0);
    }

}