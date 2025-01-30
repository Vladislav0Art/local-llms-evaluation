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

public class GeneratedSelectXpathTest {

    @Test
    public void selectXpathTest() {
        W3CDom dom = new W3CDom();
        Document document = Jsoup.parse("<body><p>Hello</p><p>World</p></body>", "", Parser.xmlParser());
        org.w3c.dom.Document w3cDocument = dom.fromJsoup(document);
        NodeList nodeList = dom.selectXpath("//p", w3cDocument);

        assertNotNull(nodeList);
        assertEquals(2, nodeList.getLength());
    }

}