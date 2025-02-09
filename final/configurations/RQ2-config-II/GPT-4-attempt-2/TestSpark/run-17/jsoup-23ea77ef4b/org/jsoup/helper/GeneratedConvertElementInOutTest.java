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

public class GeneratedConvertElementInOutTest {

    private final W3CDom dom = new W3CDom();

    @Test
    public void ConvertElementInOutTest() throws ParserConfigurationException {
        org.jsoup.nodes.Element in = new org.jsoup.nodes.Element("", "");
        org.w3c.dom.Document out = W3CDom.from(null);
        W3CDom.convertFrom(in, out);
        assertNotNull(out);
    }

}