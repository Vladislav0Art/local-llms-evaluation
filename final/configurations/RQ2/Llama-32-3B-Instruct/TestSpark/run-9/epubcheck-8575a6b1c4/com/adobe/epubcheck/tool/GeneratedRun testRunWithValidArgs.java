package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

import org.w3c.epubcheck.core.Checker;
import org.w3c.epubcheck.util.url.URLUtils;

public class GeneratedRun testRunWithValidArgs {

    @Test
    public void run

    testRunWithValidArgs() throws IOException, Exception {
        String[] args = {"-p", "epub3"};
        int result = EpubChecker(args).run(args);
        assertTrue(result == 0);
    }

}