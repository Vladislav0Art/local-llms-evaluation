package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

public class GeneratedRun_InvalidEpubFileReturnsNonZeroErrors {

    @Test
    public void run_InvalidEpubFileReturnsNonZeroErrors() throws IOException {
        File file = new File("invalid.epb");
        int errors = new EpubChecker().run(new String[]{"-f", file.getAbsolutePath()});
        assertTrue(errors > 0);
    }

}