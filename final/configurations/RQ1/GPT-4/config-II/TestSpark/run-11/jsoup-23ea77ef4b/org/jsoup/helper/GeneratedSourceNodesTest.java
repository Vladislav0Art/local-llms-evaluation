package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedSourceNodesTest {

    private W3CDom w3cDom = new W3CDom();

    @Test
    public void sourceNodesTest() throws ParserConfigurationException {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><body>test</body></html");
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        NodeList nodeList = w3cDoc.getElementsByTagName("body");

        List<Element> nodes = w3cDom.sourceNodes(nodeList, Element.class);

        assertEquals(nodes.get(0).tagName(), "body");
    }

}