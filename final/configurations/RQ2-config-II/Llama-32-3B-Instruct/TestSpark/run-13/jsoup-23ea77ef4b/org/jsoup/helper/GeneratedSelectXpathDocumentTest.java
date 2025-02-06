package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.ParserConfigurationException;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedSelectXpathDocumentTest {

    @Test
    public void selectXpathDocumentTest() throws ParserConfigurationException, XPathExpressionException {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                .parse("test.xml");
        NodeList nodeList = W3CDom.selectXpath("//test", doc);
        assertNotNull(nodeList);
    }

}