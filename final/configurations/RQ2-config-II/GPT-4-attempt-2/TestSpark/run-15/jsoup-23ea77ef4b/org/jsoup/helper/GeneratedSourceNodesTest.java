package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedSourceNodesTest {

    @Test
    public void sourceNodesTest() {
        W3CDom testObj = new W3CDom();
        Document jsoupDocument = new Document("");
        Document doc = testObj.fromJsoup(jsoupDocument);
        NodeList nodeList = doc.getChildNodes();
        assertNotNull(testObj.sourceNodes(nodeList, Element.class));
    }

}