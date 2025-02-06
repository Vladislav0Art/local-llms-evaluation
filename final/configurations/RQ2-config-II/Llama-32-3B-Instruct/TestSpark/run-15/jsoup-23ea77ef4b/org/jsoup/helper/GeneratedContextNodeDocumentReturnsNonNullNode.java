package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.NodeList;
import org.w3c.dom.DocumentType;

public class GeneratedContextNodeDocumentReturnsNonNullNode {

    @Test
    public void contextNodeDocumentReturnsNonNullNode() {
        Document wDoc = new Document();
        Node contextNode = W3CDom.contextNode(wDoc);
        assertNotNull(contextNode);
    }

}