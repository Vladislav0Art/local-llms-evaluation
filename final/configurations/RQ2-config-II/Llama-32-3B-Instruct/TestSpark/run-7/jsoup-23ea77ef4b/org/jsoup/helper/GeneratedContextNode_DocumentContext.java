package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedContextNode_DocumentContext {

    @Test
    public void contextNode_DocumentContext() {
        Document wDoc = new org.jsoup.internal.JsoupInternalDocument();
        Node expectedContextNode = new org.jsoup.internal.JsoupInternalNode();
        Node actualContextNode = W3CDom.contextNode(wDoc);
        assertEquals(expectedContextNode, actualContextNode);
    }

}