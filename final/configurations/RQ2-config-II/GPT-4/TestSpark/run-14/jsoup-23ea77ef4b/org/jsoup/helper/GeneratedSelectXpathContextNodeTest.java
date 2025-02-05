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

public class GeneratedSelectXpathContextNodeTest {

    @Test
    public void selectXpathContextNodeTest() {
        Document document = Document.createShell("");
        W3CDom w3CDom = new W3CDom();
        NodeList nodeList = w3CDom.selectXpath("//*", document);
        NodeList selected = w3CDom.selectXpath("//*", nodeList.item(0));
        Assert.assertEquals(0, selected.getLength());
    }

}