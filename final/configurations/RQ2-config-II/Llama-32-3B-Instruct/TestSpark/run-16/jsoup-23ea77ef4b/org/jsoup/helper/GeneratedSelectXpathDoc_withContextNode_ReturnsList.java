package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;

public class GeneratedSelectXpathDoc_withContextNode_ReturnsList {

    @Test
    public void selectXpathDoc_withContextNode_ReturnsList() throws Exception {
        Document doc = new org.w3c.dom.Document(); // Mock Doc
        Node contextNode = new org.w3c.dom.Node();
        NodeList nodeList = W3CDom.selectXpath("xpath", doc, contextNode);
        assertNotNull(nodeList);
    }

}