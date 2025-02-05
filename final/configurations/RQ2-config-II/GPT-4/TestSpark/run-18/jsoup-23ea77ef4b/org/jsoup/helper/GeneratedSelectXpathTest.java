package org.jsoup.helper;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.helper.W3CDom;
import org.w3c.dom.NodeList;

import java.util.List;
import java.util.HashMap;

import org.jsoup.Jsoup;

public class GeneratedSelectXpathTest {

    @Test
    public void selectXpathTest() {
        W3CDom w3cDom = new W3CDom();
        org.w3c.dom.Document document = W3CDom.convert(Jsoup.parse("<html><body><div><p>Hello World</p></div></body></html>"));
        NodeList nodeList = w3cDom.selectXpath("//div", document);
        assertNotNull(nodeList);
        assertEquals(1, nodeList.getLength());
    }

}