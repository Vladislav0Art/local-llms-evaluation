package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedSourceNodesTest {

    @Test
    public void sourceNodesTest() {
        W3CDom dom = new W3CDom();
        Document jsoupDocument = new Document("https://www.example.org/");
        Element element = new Element("ExampleElement");
        jsoupDocument.appendChild(element);

        org.w3c.dom.Document w3cDocument = dom.fromJsoup(jsoupDocument);
        org.w3c.dom.NodeList nodeList = w3cDocument.getChildNodes();

        List<Element> sourceNodes = dom.sourceNodes(nodeList, Element.class);
        assertEquals(1, sourceNodes.size());
        assertEquals(element, sourceNodes.get(0));
    }

}