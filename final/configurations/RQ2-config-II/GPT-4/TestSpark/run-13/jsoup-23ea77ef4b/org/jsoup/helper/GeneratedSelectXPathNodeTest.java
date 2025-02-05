package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Node;

import java.util.HashMap;

public class GeneratedSelectXPathNodeTest {

    @Test
    public void SelectXPathNodeTest() {
        String xpath = "/test";
        Node node = Mockito.mock(Node.class);
        W3CDom w3cDom = new W3CDom();
        org.w3c.dom.NodeList result = w3cDom.selectXpath(xpath, node);
        Assert.assertNotNull(result);
    }

}