package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetLocaleTest {

    @Test
    public void getLocaleTest() {
        EpubChecker checker = new EpubChecker();
        assertEquals(Locale.ENGLISH, checker.getLocale());
    }

}