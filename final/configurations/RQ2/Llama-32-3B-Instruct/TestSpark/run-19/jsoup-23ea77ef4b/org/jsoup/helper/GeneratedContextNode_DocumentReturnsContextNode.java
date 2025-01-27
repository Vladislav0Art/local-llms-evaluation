package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GeneratedContextNode_DocumentReturnsContextNode {

    @Test
    public void contextNode_DocumentReturnsContextNode() {
        Document doc = new Document();
        Node result = W3CDom.contextNode(doc);
        assertNotNull(result);
        assertTrue(result instanceof Element);
    }

}