package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedSelectXpathTest {

    @Test
    public void selectXpathTest() {
        String html = "<html><head><title>First parse</title></head><body><p>First html</p></body></html>";
        Document jsoupDoc = Document.createShell(html);
        W3CDom w3cDom = new W3CDom();
        org.w3c.dom.Document doc = w3cDom.fromJsoup(jsoupDoc);
        NodeList nodeList = w3cDom.selectXpath("//p", doc);

        assertNotNull(nodeList);
        assertEquals(1, nodeList.getLength());
    }

}