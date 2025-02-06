package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class GeneratedRun runWithInvalidArgs {

    @Test
    public void run

    runWithInvalidArgs() {
        EpubChecker instance = new EpubChecker();
        String[] args = {"path/to/file", "invalidArg"};
        int expectedExitCode = 1;
        int actualExitCode = instance.run(args);
        assertEquals(expectedExitCode, actualExitCode);
    }

}