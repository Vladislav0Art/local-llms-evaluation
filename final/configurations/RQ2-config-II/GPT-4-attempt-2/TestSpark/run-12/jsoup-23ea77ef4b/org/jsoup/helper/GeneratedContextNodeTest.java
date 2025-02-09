package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedContextNodeTest {

    @Test
    public void ContextNodeTest() {
        W3CDom w3cDom = new W3CDom();
        Document doc = new Document("test");
        Node result = w3cDom.contextNode(doc);
        assertNotNull(result);
    }

}