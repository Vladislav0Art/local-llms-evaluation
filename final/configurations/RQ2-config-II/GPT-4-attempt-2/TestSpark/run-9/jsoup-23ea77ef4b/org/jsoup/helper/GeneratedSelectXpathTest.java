package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedSelectXpathTest {

    @Test
    public void selectXpathTest() {
        W3CDom instance = new W3CDom();
        Document document = Jsoup.parse("<html></html>").ownerDocument();
        NodeList result = instance.selectXpath("/html/body", document);
        assertEquals(0, result.getLength());
    }

}