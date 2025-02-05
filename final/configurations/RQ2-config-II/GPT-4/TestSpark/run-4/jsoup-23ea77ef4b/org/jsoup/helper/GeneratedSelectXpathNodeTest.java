package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.jsoup.nodes.Element;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSelectXpathNodeTest {

    @Test
    public void selectXpathNodeTest() {
        W3CDom w3CDom = new W3CDom();
        Node node = Mockito.mock(Node.class);
        NodeList nodeList = w3CDom.selectXpath("//a", node);
        Assert.assertNotNull(nodeList);
    }

}