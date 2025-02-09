package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedContextNodeDocumentTest_contextNode {

    @Test
    public void contextNodeDocumentTest_contextNode() {
        Document wDoc = new org.jsoup.nodes.Document();
        Node contextNode = W3CDom.contextNode(wDoc);
        assertNotNull(contextNode);
    }

}