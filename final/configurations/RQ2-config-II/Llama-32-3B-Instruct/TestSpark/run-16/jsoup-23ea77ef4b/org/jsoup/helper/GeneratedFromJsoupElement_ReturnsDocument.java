package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;

public class GeneratedFromJsoupElement_ReturnsDocument {

    @Test
    public void fromJsoupElement_ReturnsDocument() throws Exception {
        org.jsoup.nodes.Element in = new org.jsoup.nodes.Element(); // Mock Jsoup Element
        Document out = W3CDom.fromJsoup(in);
        assertTrue(out instanceof org.w3c.dom.Document);
    }

}