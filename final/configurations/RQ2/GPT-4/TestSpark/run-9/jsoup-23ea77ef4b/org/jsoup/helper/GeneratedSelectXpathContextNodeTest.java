package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedSelectXpathContextNodeTest {

    @Test
    public void selectXpathContextNodeTest() {
        W3CDom w3cDom = new W3CDom();
        Node node = new org.jsoup.nodes.Element("").childNode(0);
        NodeList nodeList = w3cDom.selectXpath("", node);
        assertNotNull(nodeList);
    }

}