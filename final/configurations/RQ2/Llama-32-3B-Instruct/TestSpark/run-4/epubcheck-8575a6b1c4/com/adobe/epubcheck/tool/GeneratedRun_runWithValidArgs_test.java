package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Locale;

public class GeneratedRun_runWithValidArgs_test {

    @Test
    public void run_runWithValidArgs_test() {
        String[] args = {"--validate", "--profile", "EPUB3"};
        EpubChecker checker = new EpubChecker();
        int result = checker.run(args);
        assertTrue(result == 0);
    }

}