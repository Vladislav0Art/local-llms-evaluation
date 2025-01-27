package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class GeneratedRun RunTest {

    @Test
    public void run

    RunTest() throws Exception {
        EpubChecker checker = new EpubChecker();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        checker.run(new String[]{"--locale", "en-US"});
        PrintWriter pw = new PrintWriter(outContent);
        assertTrue(new String(outContent.toByteArray()).contains("EpubChecker"));
    }

}