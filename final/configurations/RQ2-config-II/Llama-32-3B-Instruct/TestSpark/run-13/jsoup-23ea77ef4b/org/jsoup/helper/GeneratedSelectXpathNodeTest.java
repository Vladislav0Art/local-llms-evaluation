package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.ParserConfigurationException;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedSelectXpathNodeTest {

    @Test
    public void selectXpathNodeTest() throws ParserConfigurationException, XPathExpressionException {
        Element domElem = doc().element();
        NodeList nodeList = W3CDom.selectXpath("//test", domElem);
        assertNotNull(nodeList);
    }

}