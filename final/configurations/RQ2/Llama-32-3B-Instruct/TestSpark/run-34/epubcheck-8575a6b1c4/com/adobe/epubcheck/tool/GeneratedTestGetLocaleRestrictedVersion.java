package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import com.adobe.epubcheck.tool.EpubChecker;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilderFactory;

public class GeneratedTestGetLocaleRestrictedVersion {

    @Test
    public void testGetLocaleRestrictedVersion() {
        EpubChecker epubChecker = new EpubChecker();
        Locale locale = epubChecker.getLocale();
        assertEquals(Locale.US, locale);
    }

}