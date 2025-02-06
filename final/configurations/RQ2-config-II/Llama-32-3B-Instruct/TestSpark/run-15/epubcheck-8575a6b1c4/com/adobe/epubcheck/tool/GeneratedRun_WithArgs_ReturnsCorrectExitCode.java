package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

public class GeneratedRun_WithArgs_ReturnsCorrectExitCode {

    @Test
    public void run_WithArgs_ReturnsCorrectExitCode() throws Exception {
        String[] args = {"arg1", "arg2"};
        int result = new EpubChecker().run(args);
        assertEquals(3, result);
    }

}