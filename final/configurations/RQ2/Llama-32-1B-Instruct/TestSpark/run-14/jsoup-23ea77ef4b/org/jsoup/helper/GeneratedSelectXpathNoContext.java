package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedSelectXpathNoContext {

    @Test
    public void selectXpathNoContext() {
        org.jsoup.nodes.Document soupDoc = W3CDom.fromJsoup(org.jsoup.nodes.DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("<html><body>Hello World!</body></html>"));
        Document domDoc = neworg.jsoup.helper.W3CDom.Converter.convert(soupDoc, null);
        NodeList nodeList = W3CDom.fromJsoup(soupDoc).selectXpath("xpath");
        assertEquals(null, nodeList);
    }

}