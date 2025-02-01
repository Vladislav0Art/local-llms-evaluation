package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedSourceNodesTest {

    @Test
    public void sourceNodesTest() {
        String html = "<html><head><title>First parse</title></head><body><p>First html</p></body></html>";
        Document jsoupDoc = Document.createShell(html);
        W3CDom w3cDom = new W3CDom();
        org.w3c.dom.Document doc = w3cDom.fromJsoup(jsoupDoc);
        NodeList nodeList = w3cDom.selectXpath("//p", doc);

        List<org.jsoup.nodes.Element> nodes = w3cDom.sourceNodes(nodeList, org.jsoup.nodes.Element.class);

        assertNotNull(nodes);
        assertFalse(nodes.isEmpty());
        assertEquals("p", nodes.get(0).nodeName());
    }

}