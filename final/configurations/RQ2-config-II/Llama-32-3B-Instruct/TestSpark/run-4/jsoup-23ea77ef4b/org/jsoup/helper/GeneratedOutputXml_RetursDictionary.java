package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;

public class GeneratedOutputXml_RetursDictionary {

    @Test
    public void OutputXml_RetursDictionary() {
        Map<String, String> result = W3CDom.OutputXml();
        assertNotNull(result);
        assertTrue(result.containsKey("doctype"));
        assertTrue(result.containsKey("encoding"));
        assertTrue(result.containsKey("xmlversion"));
        assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>", result.get("doctype"));
    }

}