package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GeneratedRun_withoutArguments_testRunWithoutArguments {

    @Test
    public void run_withoutArguments_testRunWithoutArguments() throws IOException, Exception {
        String[] args = {};
        int result = EpubChecker(args).run(args);
        assertTrue(result >= 0 && result <= 1);
    }

}