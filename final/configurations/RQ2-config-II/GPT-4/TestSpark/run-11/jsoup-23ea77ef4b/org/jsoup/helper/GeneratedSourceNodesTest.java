package org.jsoup.helper;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedSourceNodesTest {

    @Test
    public void sourceNodesTest() {
        NodeList nodeList = W3CDom.convert(new Document("http://test.org")).getChildNodes();
        List<Element> result = new W3CDom().sourceNodes(nodeList, Element.class);
        assertNotNull(result);
    }

}