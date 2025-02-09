package org.jsoup.helper;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import static org.junit.Assert.*;

public class GeneratedConvertDocumentTest {

    private final W3CDom dom = new W3CDom();

    @Test
    public void ConvertDocumentTest() throws ParserConfigurationException {
        org.jsoup.nodes.Document input = new org.jsoup.nodes.Document("");
        Document output = W3CDom.convert(input);
        assertNotNull(output);
    }

}