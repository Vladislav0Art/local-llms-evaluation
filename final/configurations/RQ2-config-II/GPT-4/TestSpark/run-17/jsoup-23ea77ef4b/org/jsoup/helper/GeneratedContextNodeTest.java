package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedContextNodeTest {

    @Test
    public void contextNodeTest() {
        W3CDom dom = new W3CDom();
        org.w3c.dom.Document doc = W3CDom.convert(new Document(""));
        Node actual = dom.contextNode(doc);
        assertNotNull(actual);
    }

}