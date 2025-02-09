package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import com.adobe.epubcheck.tool.EpubChecker;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilderFactory;

public class GeneratedTestGetLocale {

    @Test
    public void testGetLocale() {
        EpubChecker epubChecker = new EpubChecker();
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        assertEquals(Locale.US, epubChecker.getLocale(document));
    }

}