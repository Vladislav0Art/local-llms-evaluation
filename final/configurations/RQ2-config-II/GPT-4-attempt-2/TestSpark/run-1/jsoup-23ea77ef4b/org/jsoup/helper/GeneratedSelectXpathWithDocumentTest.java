package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class GeneratedSelectXpathWithDocumentTest {

    @Test
    public void selectXpathWithDocumentTest() {
        W3CDom w3cDom = new W3CDom();
        org.w3c.dom.Document document = Mockito.mock(org.w3c.dom.Document.class);
        NodeList nodeList = w3cDom.selectXpath("/", document);
        Assert.assertNotNull(nodeList);
    }

}