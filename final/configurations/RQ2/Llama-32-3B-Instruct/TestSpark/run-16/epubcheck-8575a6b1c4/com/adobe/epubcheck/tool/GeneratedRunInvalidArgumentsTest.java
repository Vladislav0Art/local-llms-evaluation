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

public class GeneratedRunInvalidArgumentsTest {

    @Test
    public void runInvalidArgumentsTest() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        try {
            EpubChecker.run(new String[]{"invalid", "-o", "output.xml"});
            fail("Expected exception not thrown");
        } catch (Exception e) {
            assertTrue(e.getMessage().contains(MessagesINVALID_ARGUMENTS));
        }
    }

}