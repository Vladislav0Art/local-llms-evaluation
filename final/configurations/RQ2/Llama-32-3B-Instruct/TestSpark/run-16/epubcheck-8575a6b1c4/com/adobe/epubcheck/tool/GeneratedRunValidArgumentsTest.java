package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class GeneratedRunValidArgumentsTest {

    @Test
    public void runValidArgumentsTest() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        try {
            EpubChecker.run(new String[]{"input.epub", "-o", "output.xml"});
            pw.close();
            PrintWriter outPw = new PrintWriter(outContent);
            assertTrue(outContent.toString().contains("Report saved to:"));
        } catch (Exception e) {
            fail("Expected exception not thrown");
        }
    }

}