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

public class GeneratedSelectXpathDocumentTest {

    @Test
    public void selectXpathDocumentTest() {
        W3CDom w3CDom = new W3CDom();
        Document doc = Mockito.mock(Document.class);
        NodeList nodeList = w3CDom.selectXpath("//a", doc);
        Assert.assertNotNull(nodeList);
    }

}