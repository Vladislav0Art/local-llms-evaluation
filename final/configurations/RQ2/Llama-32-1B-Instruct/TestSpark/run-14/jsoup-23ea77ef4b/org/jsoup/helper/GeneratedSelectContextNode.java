package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedSelectContextNode {

    @Test
    public void selectContextNode() {
        org.jsoup.nodes.Document soupDoc = W3CDom.fromJsoup(org.jsoup.nodes.DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("<html><body>Hello World!</body></html>"));
        Document domDoc = neworg.jsoup.helper.W3CDom.Converter.convert(soupDoc, null);
        Element contextNode = (Element) W3CDom.fromJsoup(soupDoc).contextNode();
        assertEquals("Hello World!", contextNode.asString());
    }

}