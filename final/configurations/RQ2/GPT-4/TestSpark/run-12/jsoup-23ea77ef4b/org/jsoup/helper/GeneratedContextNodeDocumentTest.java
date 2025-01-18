package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedContextNodeDocumentTest {

    @Test
    public void contextNodeDocumentTest() {
        W3CDom w3cDom = new W3CDom();
        Document doc = new Document("");
        Node node = w3cDom.contextNode(doc);
        assertNotNull(node);
    }

}