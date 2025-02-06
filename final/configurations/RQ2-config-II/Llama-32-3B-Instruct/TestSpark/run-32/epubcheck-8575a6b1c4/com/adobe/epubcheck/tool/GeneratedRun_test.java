package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

public class GeneratedRun_test {

    @Test
    public void run_test() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new outWriter(outContent));
        String[] args = {"path/to/epub/file.epub"};
        int result = new EpubChecker().run(args);
        assertTrue(result >= 0);
    }

}