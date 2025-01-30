package org.jsoup.helper;

import static org.junit.Assert.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Selector.SelectorParseException;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.List;

public class GeneratedSourceNodesTest {

    @Test
    public void sourceNodesTest() {
        W3CDom dom = new W3CDom();
        Document document = Jsoup.parse("<body><p>Hello</p><p>World</p></body>", "", Parser.xmlParser());
        org.w3c.dom.Document w3cDocument = dom.fromJsoup(document);
        NodeList nodeList = dom.selectXpath("//p", w3cDocument);
        List<Element> elements = dom.sourceNodes(nodeList, Element.class);

        assertNotNull(elements);
        assertEquals(2, elements.size());
        assertEquals("<p>Hello</p>", elements.get(0).toString());
        assertEquals("<p>World</p>", elements.get(1).toString());
    }

}