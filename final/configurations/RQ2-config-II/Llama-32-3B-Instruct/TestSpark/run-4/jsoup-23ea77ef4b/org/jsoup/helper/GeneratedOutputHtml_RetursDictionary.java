package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;

public class GeneratedOutputHtml_RetursDictionary {

    @Test
    public void OutputHtml_RetursDictionary() {
        Map<String, String> result = W3CDom.OutputHtml();
        assertNotNull(result);
        assertTrue(result.containsKey("doctype"));
        assertTrue(result.containsKey("encoding"));
        assertTrue(result.containsKey("xmlversion"));
        assertEquals("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">", result.get("doctype"));
    }

}