package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSelectXpathWithEmptyStringReturnsEmptyList {

    @Test
    public void selectXpathWithEmptyStringReturnsEmptyList() {
        NodeList nodeList = new ArrayList<>();
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("test.xml");
        nodeList.add(doc.getDocumentElement());
        List<Node> result = W3CDom.selectXpath("", doc);
        assertTrue(result.isEmpty());
    }

}