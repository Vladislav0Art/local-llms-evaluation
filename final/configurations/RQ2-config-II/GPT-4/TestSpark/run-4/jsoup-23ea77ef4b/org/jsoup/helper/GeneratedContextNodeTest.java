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

public class GeneratedContextNodeTest {

    @Test
    public void contextNodeTest() {
        W3CDom w3CDom = new W3CDom();
        Document doc = Mockito.mock(Document.class);
        Node node = w3CDom.contextNode(doc);
        Assert.assertNotNull(node);
    }

}