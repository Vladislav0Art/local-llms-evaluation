package org.jsoup.helper;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import static org.junit.Assert.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSelectXpathNodeTest {

    @Test
    public void selectXpathNodeTest() {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><head><title>First parse</title></head><body>Test page</body></html>");
        Document w3cDocument = W3CDom.convert(jsoupDoc);
        W3CDom w3cDom = new W3CDom();
        NodeList nodeList = w3cDom.selectXpath("//title", w3cDocument);
        assertEquals(nodeList.getLength(), 1);
    }

}