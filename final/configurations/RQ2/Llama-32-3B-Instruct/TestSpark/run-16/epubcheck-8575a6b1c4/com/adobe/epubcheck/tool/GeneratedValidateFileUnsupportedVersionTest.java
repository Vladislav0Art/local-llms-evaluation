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

public class GeneratedValidateFileUnsupportedVersionTest {

    @Test
    public void validateFileUnsupportedVersionTest() throws IOException {
        EpubChecker.setEPUBProfile(new EPUBProfile(true));
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        try {
            EpubChecker.validateFile("input.epub", EPUBVersion.V3_0, new HashMap<>(), EpubChecker.getLocale());
            PrintWriter outPw = new PrintWriter(outContent);
            assertTrue(outContent.toString().contains(MessagesUNSUPPORTED_VERSION));
        } catch (Exception e) {
            fail("Expected exception not thrown");
        }
    }

}