package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.ParserConfigurationException;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedSourceNodesDocumentTest {

    @Test
    public void sourceNodesDocumentTest() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                .parse("test.xml");
        NodeList nodeList = W3CDom.selectXpath("//test", doc);
        List<Node> result = W3CDom.sourceNodes(nodeList, Node.class);
        assertNotNull(result);
    }

}