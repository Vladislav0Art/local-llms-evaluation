package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.nodes.Document;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.DOMException;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;

import static org.junit.Assert.*;

public class GeneratedSelectXpathNodeTest {

    @Test
    public void selectXpathNodeTest() {
        String xpath = "//body";
        Node contextNode = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument().getDocumentElement();
        W3CDom instance = new W3CDom();
        NodeList result = instance.selectXpath(xpath, contextNode);
        assertNotNull(result);
    }

}