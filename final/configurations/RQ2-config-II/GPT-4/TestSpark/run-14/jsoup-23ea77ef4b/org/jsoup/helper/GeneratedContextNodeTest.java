package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.jsoup.nodes.Document;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class GeneratedContextNodeTest {

    @Test
    public void contextNodeTest() {
        Document document = Document.createShell("");
        W3CDom w3CDom = new W3CDom();
        Node contextNode = w3CDom.contextNode(document);
        Assert.assertNotNull(contextNode);
    }

    @Ignore("Test ignored")
    public void OutputHtmlTest() {
    }

    @Ignore("Test ignored")
    public void OutputXmlTest() {
    }

    @Ignore("Test ignored")
    public void asStringMapTest() {
    }

    @Ignore("Test ignored")
    public void asStringTest() {
    }

    @Ignore("Test ignored")
    public void propertiesFromMapTest() {
    }

}