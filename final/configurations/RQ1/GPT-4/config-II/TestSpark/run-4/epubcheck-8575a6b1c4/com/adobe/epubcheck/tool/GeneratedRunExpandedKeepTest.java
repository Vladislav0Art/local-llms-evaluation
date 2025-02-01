package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.Locale;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.messages.MessageDictionaryDumper;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.*;
import com.adobe.epubcheck.api.*;

public class GeneratedRunExpandedKeepTest {

    @Test
    public void runExpandedKeepTest() {
        String[] args = {"tests/valid_directory", "-mode", "exp", "-save"};
        EpubChecker checker = new EpubChecker();
        assertEquals(0, checker.run(args));
        File output = new File("tests/valid_directory.epub");
        assertTrue(output.exists());
        output.delete();
    }

}