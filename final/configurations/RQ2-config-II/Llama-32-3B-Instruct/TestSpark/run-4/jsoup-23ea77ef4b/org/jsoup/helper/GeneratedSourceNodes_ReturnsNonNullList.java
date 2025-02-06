package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;

public class GeneratedSourceNodes_ReturnsNonNullList {

    @Test
    public void sourceNodes_ReturnsNonNullList() {
        NodeList nodeList = new org.jsoup.nodes.NodeList();
        List<org.jsoup.nodes.Node> result = W3CDom.sourceNodes(nodeList, org.jsoup.nodes.Node.class);
        assertNotNull(result);
        assertEquals(0, result.size());
    }

}