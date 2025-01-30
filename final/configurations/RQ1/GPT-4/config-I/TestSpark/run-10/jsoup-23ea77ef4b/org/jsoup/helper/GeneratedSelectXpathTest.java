package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedSelectXpathTest {

    @Test
    public void selectXpathTest() {
        Document document = new Document("");
        W3CDom w3cDom = new W3CDom();
        org.w3c.dom.Document convertedDoc = W3CDom.convert(document);
        NodeList nodeList = w3cDom.selectXpath("/", convertedDoc);
        assertNotNull(nodeList);
    }

}