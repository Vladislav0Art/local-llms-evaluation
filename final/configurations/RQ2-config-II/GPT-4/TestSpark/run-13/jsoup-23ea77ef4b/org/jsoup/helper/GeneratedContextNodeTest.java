package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Node;

import java.util.HashMap;

public class GeneratedContextNodeTest {

    @Test
    public void ContextNodeTest() {
        org.w3c.dom.Document document = Mockito.mock(org.w3c.dom.Document.class);
        W3CDom w3cDom = new W3CDom();
        Node result = w3cDom.contextNode(document);
        Assert.assertNotNull(result);
    }

}