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

public class GeneratedConvertDocumentInOutTest {

    private final W3CDom dom = new W3CDom();

    @Test
    public void ConvertDocumentInOutTest() throws ParserConfigurationException {
        org.jsoup.nodes.Document in = new org.jsoup.nodes.Document("");
        org.w3c.dom.Document out = W3CDom.from(null);
        W3CDom.convertFrom(in, out);
        assertNotNull(out);
    }

}