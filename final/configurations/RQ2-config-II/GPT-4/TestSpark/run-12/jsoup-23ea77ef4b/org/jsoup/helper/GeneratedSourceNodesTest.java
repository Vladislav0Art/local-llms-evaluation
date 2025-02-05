package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedSourceNodesTest {

    W3CDom w3cDom = new W3CDom();

    @Test
    public void sourceNodesTest() {
        org.w3c.dom.Document xmlDom = generateMockDocument();
        NodeList nodeList = xmlDom.getChildNodes();
        List<Document> res = w3cDom.sourceNodes(nodeList, Document.class);

        assertEquals(1, res.size());
        assertTrue(res.get(0) instanceof Document);
    }

}