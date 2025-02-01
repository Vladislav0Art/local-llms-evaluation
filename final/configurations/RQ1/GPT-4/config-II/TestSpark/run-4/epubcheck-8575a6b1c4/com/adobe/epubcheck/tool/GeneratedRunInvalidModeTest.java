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

public class GeneratedRunInvalidModeTest {

    @Test
    public void runInvalidModeTest() {
        String[] args = {"tests/valid.epub", "-mode", "notamode"};
        EpubChecker checker = new EpubChecker();
        assertEquals(1, checker.run(args));
    }

}