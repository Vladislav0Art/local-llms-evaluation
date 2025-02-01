package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedConvertFromElementTest {

    @Test
    public void convertFromElementTest() {
        W3CDom dom = new W3CDom();
        Document jsoupDocument = new Document("https://www.example.org");
        Element element = new Element("SomeElement");
        jsoupDocument.appendChild(element);

        org.w3c.dom.Document w3cDocument = W3CDom.convert(jsoupDocument);
        dom.convert(element, w3cDocument);

        Node w3cNode = dom.contextNode(w3cDocument);
        assertNotNull(w3cNode);
        assertSame(w3cNode.getUserData("jsoupSource"), element);
    }

}