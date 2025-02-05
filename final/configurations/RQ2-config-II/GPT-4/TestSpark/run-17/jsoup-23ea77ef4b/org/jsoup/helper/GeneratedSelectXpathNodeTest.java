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

public class GeneratedSelectXpathNodeTest {

    @Test
    public void selectXpathNodeTest() {
        W3CDom dom = new W3CDom();
        Node node = W3CDom.convert(new Document("")).getFirstChild();
        NodeList actual = dom.selectXpath("/", node);
        assertNotNull(actual);
    }

}