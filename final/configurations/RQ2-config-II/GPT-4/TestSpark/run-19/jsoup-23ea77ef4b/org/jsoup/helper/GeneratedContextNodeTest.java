package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedContextNodeTest {

    @Test
    public void contextNodeTest() {
        org.w3c.dom.Document wDoc = W3CDom.convert(new Document("Test Title"));
        Node node = new W3CDom().contextNode(wDoc);

        assertNotNull(node);
        assertTrue(node.getNodeName().contains("html"));
    }

}