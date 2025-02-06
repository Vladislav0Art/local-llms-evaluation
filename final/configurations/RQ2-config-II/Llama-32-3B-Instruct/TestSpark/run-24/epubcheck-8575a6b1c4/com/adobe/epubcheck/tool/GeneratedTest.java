package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void getLocale

    locale() {
        EpubChecker instance = new EpubChecker();
        Locale expectedLocale = new Locale("en", "US");
        Locale actualLocale = instance.getLocale();
        assertEquals(expectedLocale, actualLocale);
    }

    @Test
    public void run

    runWithValidArgs() {
        EpubChecker instance = new EpubChecker();
        String[] args = {"path/to/file", "version"};
        int expectedExitCode = 0;
        int actualExitCode = instance.run(args);
        assertEquals(expectedExitCode, actualExitCode);
    }

    @Test
    public void run

    runWithInvalidArgs() {
        EpubChecker instance = new EpubChecker();
        String[] args = {"path/to/file", "invalidArg"};
        int expectedExitCode = 1;
        int actualExitCode = instance.run(args);
        assertEquals(expectedExitCode, actualExitCode);
    }

    @Test
    public void validateFile

    validateWithValidArgs() {
        EpubChecker instance = new EpubChecker();
        String path = "path/to/file";
        EPUBVersion version = new EPUBVersion("1.0");
        Report report = new Report();
        EPUBProfile profile = new EPUBProfile();
        int expectedExitCode = 0;
        int actualExitCode = instance.validateFile(path, version, report, profile);
        assertEquals(expectedExitCode, actualExitCode);
    }

    @Test
    public void validateFile

    validateWithInvalidArgs() {
        EpubChecker instance = new EpubChecker();
        String path = "path/to/file";
        EPUBVersion version = new EPUBVersion("invalid");
        Report report = new Report();
        EPUBProfile profile = new EPUBProfile();
        int expectedExitCode = 1;
        int actualExitCode = instance.validateFile(path, version, report, profile);
        assertEquals(expectedExitCode, actualExitCode);
    }

}