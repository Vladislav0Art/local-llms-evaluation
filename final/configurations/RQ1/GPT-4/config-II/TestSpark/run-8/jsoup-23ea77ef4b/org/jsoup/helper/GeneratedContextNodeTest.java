package org.jsoup.helper;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import static org.junit.Assert.*;

public class GeneratedContextNodeTest {

    @Test
    public void contextNodeTest() {
        org.jsoup.nodes.Document input = new Document("http://example.com");
        W3CDom w3cDom = new W3CDom();
        Document output = w3cDom.fromJsoup(input);
        Node contextNode = w3cDom.contextNode(output);
        assertNotNull(contextNode);
    }

}