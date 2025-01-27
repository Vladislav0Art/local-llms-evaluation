package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.ParserConfigurationException;

public class GeneratedSelectXpathStringElement_ReturnsNodeList {

    @Test
    public void selectXpathStringElement_ReturnsNodeList() {
        Document doc = null;
        Node contextNode = new org.jsoup.nodes.Document();
        NodeList nodeList = W3CDom.selectXpath("test", doc, contextNode);
        assertNotNull(nodeList);
    }

}