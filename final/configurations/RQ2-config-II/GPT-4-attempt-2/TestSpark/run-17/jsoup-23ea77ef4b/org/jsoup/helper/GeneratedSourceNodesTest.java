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

public class GeneratedSourceNodesTest {

    private final W3CDom dom = new W3CDom();

    @Test
    public void SourceNodesTest() throws ParserConfigurationException {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        NodeList nodes = dom.selectXpath("//body", doc);
        List<Element> list = dom.sourceNodes(nodes, Element.class);
        assertNotNull(list);
    }

}