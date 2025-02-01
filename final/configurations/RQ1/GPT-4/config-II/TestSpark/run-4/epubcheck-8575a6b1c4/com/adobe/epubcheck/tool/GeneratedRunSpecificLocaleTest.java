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

public class GeneratedRunSpecificLocaleTest {

    @Test
    public void runSpecificLocaleTest() {
        String[] args = {"tests/valid.epub", "-locale", "fr"};
        EpubChecker checker = new EpubChecker();
        assertEquals(0, checker.run(args));
        assertEquals(new Locale("fr"), checker.getLocale());
    }

}