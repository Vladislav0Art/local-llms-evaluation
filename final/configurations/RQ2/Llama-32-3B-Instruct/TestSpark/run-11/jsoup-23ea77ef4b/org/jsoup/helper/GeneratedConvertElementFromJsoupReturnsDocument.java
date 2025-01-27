package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedConvertElementFromJsoupReturnsDocument {

    @Test
    public void convertElementFromJsoupReturnsDocument() {
        org.jsoup.nodes.Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("test.xml");
        org.jsoup.nodes.Element element = new org.jsoup.nodes.Element("div", null, doc);
        Document outDoc = W3CDom.convert(element);
        assertTrue(outDoc instanceof Document);
    }

}