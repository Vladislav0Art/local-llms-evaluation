package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class GeneratedValidateFile validateWithValidArgs {

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

}