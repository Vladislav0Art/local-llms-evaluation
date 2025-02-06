package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;

public class GeneratedSourceNodes_doc_withNodeType_ReturnsList {

    @Test
    public void sourceNodes_doc_withNodeType_ReturnsList() {
        NodeList nodeList = new org.w3c.dom.NodeList(); // Mock NodeList
        Class<?> nodeType = org.jsoup.nodes.Element.class;
        List<Object> actual = W3CDom.sourceNodes(nodeList, nodeType);
        assertNotNull(actual);
    }

}