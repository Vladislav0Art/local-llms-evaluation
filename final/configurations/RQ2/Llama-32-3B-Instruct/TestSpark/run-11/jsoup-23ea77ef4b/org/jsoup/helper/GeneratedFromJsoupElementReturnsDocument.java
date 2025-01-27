package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedFromJsoupElementReturnsDocument {

    @Test
    public void fromJsoupElementReturnsDocument() {
        org.jsoup.nodes.Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("test.xml");
        org.jsoup.nodes.Element element = new org.jsoup.nodes.Element("div", null, doc);
        Document outDoc = W3CDom.fromJsoup(element);
        assertTrue(outDoc instanceof Document);
    }

}