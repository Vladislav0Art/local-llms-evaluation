package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GeneratedRun_withValidArgs_testRunWithValidArgs {

    @Test
    public void run_withValidArgs_testRunWithValidArgs() throws IOException, Exception {
        String[] args = {"-p", "epub3"};
        int result = EpubChecker(args).run(args);
        assertTrue(result == 0);
    }

}