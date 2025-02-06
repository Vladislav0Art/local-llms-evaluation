package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;

public class GeneratedFromJsoupDoc_ReturnsDocument {

    @Test
    public void fromJsoupDoc_ReturnsDocument() throws Exception {
        org.jsoup.nodes.Document in = new org.jsoup.nodes.Document(); // Mock Jsoup Doc
        Document out = W3CDom.fromJsoup(in);
        assertTrue(out instanceof org.w3c.dom.Document);
    }

}