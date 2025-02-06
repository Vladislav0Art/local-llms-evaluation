package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Locale;

public class GeneratedRun_NonEmptyArgsArray_ReturnsCorrectResult {

    @Test
    public void run_NonEmptyArgsArray_ReturnsCorrectResult() throws Exception {
        File epubFile = new File("path/to/epub/file.epub");
        File tmpDir = File.createTempDirectory("tmp");
        String[] args = {"--tmpdir", tmpDir.getAbsolutePath(), "--format", "json"};
        int result = new EpubChecker().run(args);
        assertTrue(result >= 0);
    }

}