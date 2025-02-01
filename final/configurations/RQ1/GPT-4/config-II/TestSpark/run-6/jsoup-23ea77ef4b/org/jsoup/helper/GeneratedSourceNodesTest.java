package org.jsoup.helper;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedSourceNodesTest {

    @Test
    public void sourceNodesTest() {
        Document doc = new Document("");
        Element element = new Element("div");
        doc.appendElement(element);
        W3CDom w3CDom = new W3CDom();
        org.w3c.dom.Document w3cDoc = w3CDom.fromJsoup(element);
        NodeList nodeList = w3CDom.selectXpath("//div", w3cDoc);
        List<Element> elements = w3CDom.sourceNodes(nodeList, Element.class);
        assertFalse(elements.isEmpty());
    }

}