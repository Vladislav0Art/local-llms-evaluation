package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactoryConfigurationError;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedSourceNodesTest {

    @Test
    public void sourceNodesTest() throws IOException {
        org.jsoup.nodes.Document document = Jsoup.connect("https://www.google.com").get();
        W3CDom w3cDom = new W3CDom();
        Document converted = w3cDom.fromJsoup(document);
        NodeList nodeList = converted.getElementsByTagName("body");
        List<Element> elements = w3cDom.sourceNodes(nodeList, Element.class);
        assertFalse(elements.isEmpty());
    }

}