package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;

public class GeneratedContextNode_ReturnsContextNode {

    @Test
    public void contextNode_ReturnsContextNode() {
        Document doc = Document.createElement();
        Node contextNode = W3CDom.contextNode(doc);
        assertNotNull(contextNode);
    }

}