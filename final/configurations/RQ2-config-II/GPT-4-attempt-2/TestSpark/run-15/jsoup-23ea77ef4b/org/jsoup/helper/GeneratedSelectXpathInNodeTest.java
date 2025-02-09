package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedSelectXpathInNodeTest {

    @Test
    public void selectXpathInNodeTest() {
        W3CDom testObj = new W3CDom();
        Document jsoupDocument = new Document("");
        Document doc = testObj.fromJsoup(jsoupDocument);
        Node node = doc.createElement("div");
        NodeList nodeList = testObj.selectXpath("/div/p", node);
        assertNotNull(nodeList);
    }

}