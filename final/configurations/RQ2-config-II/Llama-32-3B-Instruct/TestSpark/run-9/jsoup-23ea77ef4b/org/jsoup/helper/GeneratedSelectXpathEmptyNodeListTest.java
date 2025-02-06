package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeList;

public class GeneratedSelectXpathEmptyNodeListTest {

    @Test
    public void selectXpathEmptyNodeListTest() {
        NodeList nodeList = new NodeList();
        NodeList result = org.jsoup.helper.W3CDom.selectXpath("xpath", nodeList);
        assertTrue(result.size() == 0);
    }

}