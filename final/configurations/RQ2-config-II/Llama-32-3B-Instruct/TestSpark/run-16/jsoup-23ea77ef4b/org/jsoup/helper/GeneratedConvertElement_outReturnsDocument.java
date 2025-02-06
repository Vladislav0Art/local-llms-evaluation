package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;

public class GeneratedConvertElement_outReturnsDocument {

    @Test
    public void convertElement_outReturnsDocument() throws Exception {
        org.jsoup.nodes.Element in = new org.jsoup.nodes.Element(); // Mock Jsoup Element
        Document out = new org.w3c.dom.Document();
        W3CDom.convert(in, out);
        assertTrue(out instanceof org.w3c.dom.Document);
    }

}