package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.Properties;

public class GeneratedContextNodeTest {

    @Test
    public void contextNodeTest() {
        org.w3c.dom.Document mockDocument = Mockito.mock(org.w3c.dom.Document.class);
        W3CDom w3CDom = new W3CDom();
        Assert.assertNotNull(w3CDom.contextNode(mockDocument));
    }

}