package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class GeneratedRun_runMethodCallsValidateFile {

    private final EpubChecker epubChecker = new EpubChecker();

    @Test
    public void run_runMethodCallsValidateFile() throws Exception {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintWriter writer = new PrintWriter(outContent);
        String[] args = {"-o", "output"};

        EpubCheckFactory factory = EpubCheckFactory.getFactory();
        Checker checker = factory.createChecker(args, writer);
        epubChecker.run(args);

        assertTrue(outContent.toString().contains("Validation complete"));
    }

}