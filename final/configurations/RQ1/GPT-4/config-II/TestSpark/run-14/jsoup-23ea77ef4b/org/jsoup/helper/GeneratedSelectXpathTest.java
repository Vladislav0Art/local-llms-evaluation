package org.jsoup.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.jsoup.Jsoup;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Node;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

public class GeneratedSelectXpathTest {

    @Test
    public void selectXpathTest() {
        final org.jsoup.nodes.Document document = Jsoup.parse("<html><head></head><body><div></div></body></html>");
        final W3CDom w3CDom = new W3CDom();
        final Document w3cDocument = w3CDom.fromJsoup(document);
        final NodeList nodeList = w3CDom.selectXpath("/html/body/div", w3cDocument);
        assertEquals(1, nodeList.getLength());
    }

}