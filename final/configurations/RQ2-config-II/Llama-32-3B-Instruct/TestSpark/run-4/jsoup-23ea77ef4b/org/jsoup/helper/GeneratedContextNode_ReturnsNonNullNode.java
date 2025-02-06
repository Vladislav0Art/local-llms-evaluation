package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;

public class GeneratedContextNode_ReturnsNonNullNode {

    @Test
    public void contextNode_ReturnsNonNullNode() {
        Document wDoc = new org.jsoup.nodes.Document();
        Node node = W3CDom.contextNode(wDoc);
        assertNotNull(node);
    }

}