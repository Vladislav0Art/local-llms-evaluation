package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeList;

public class GeneratedSelectXpathNonEmptyNodeListTest {

    @Test
    public void selectXpathNonEmptyNodeListTest() {
        NodeList nodeList = new NodeList();
        nodeList.add(new Node());
        NodeList result = org.jsoup.helper.W3CDom.selectXpath("xpath", nodeList);
        assertFalse(result.size() == 0);
    }

}