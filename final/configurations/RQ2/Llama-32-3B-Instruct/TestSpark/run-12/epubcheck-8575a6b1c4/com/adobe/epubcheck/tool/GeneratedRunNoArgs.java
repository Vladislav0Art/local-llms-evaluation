package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

public class GeneratedRunNoArgs {

    @Test
    public void runNoArgs() throws IOException {
        String[] args = {};
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        outWriter writer = new outWriter(outputStream);
        EpubChecker checker = new EpubChecker(writer);
        int result = checker.run(args);
        assertEquals(0, result);
    }

}