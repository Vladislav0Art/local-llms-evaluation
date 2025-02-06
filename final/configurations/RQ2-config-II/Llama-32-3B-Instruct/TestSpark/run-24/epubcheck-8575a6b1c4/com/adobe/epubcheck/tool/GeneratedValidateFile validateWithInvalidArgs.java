package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class GeneratedValidateFile validateWithInvalidArgs {

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