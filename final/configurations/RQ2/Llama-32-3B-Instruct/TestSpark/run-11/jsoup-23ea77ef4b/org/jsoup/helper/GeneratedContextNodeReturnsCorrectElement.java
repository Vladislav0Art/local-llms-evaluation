package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedContextNodeReturnsCorrectElement {

    @Test
    public void contextNodeReturnsCorrectElement() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("test.xml");
        Element element = (Element) doc.getDocumentElement();
        Node result = W3CDom.contextNode(doc);
        assertEquals(element, result);
    }

}