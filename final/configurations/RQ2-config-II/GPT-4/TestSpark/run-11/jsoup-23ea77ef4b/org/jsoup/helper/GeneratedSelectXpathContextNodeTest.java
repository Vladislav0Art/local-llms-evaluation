package org.jsoup.helper;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedSelectXpathContextNodeTest {

    @Test
    public void selectXpathContextNodeTest() {
        Node contextNode = W3CDom.convert(new Document("http://test.org")).getFirstChild();
        NodeList result = new W3CDom().selectXpath("//test", contextNode);
        assertNotNull(result);
    }

}