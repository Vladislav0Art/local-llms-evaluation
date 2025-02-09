package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

public class GeneratedRun_ValidEpubFileReturnsZeroErrors {

    @Test
    public void run_ValidEpubFileReturnsZeroErrors() throws IOException {
        File file = new File("valid.epub");
        int errors = new EpubChecker().run(new String[]{"-f", file.getAbsolutePath()});
        assertEquals(0, errors);
    }

}