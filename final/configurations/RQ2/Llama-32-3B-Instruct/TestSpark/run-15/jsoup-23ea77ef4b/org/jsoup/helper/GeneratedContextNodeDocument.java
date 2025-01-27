package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

import static org.junit.Assert.*;

public class GeneratedContextNodeDocument {

    @Test
    public void contextNodeDocument() {
        Document wDoc = new Document();
        Node node = W3CDom.contextNode(wDoc);
        assertNotNull(node);
    }

}