package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import static org.junit.Assert.*;

public class GeneratedSelectXpathTest {

    @Test
    public void selectXpathTest() {
        Document document = new Document("http://example.com");
        document.appendElement("div").text("Hello, World!");
        org.w3c.dom.Document w3cDocument = W3CDom.convert(document);
        W3CDom w3cDom = new W3CDom();
        NodeList nodeList = w3cDom.selectXpath("//div", w3cDocument);
        assertEquals("Hello, World!", nodeList.item(0).getTextContent());
    }

}