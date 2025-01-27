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

public class GeneratedValidateFileInvalidEpubFileTest {

    @Test
    public void validateFileInvalidEpubFileTest() throws IOException {
        EpubChecker.setEPUBProfile(new EPUBProfile(false));
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        try {
            EpubChecker.validateFile("invalid.epub", EPUBVersion.V2_0, new HashMap<>(), EpubChecker.getLocale());
            PrintWriter outPw = new PrintWriter(outContent);
            assertTrue(outContent.toString().contains(MessagesINVALID_EPB_FILE));
        } catch (Exception e) {
            fail("Expected exception not thrown");
        }
    }

}