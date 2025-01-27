package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.util.Map;

public class GeneratedSourceNodesNodeListTest {

    @Test
    public void sourceNodesNodeListTest() throws Exception {
        String html = "<html><body>Hello World!</body></html>";
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new java.io.ByteArrayInputStream(html.getBytes()));
        NodeList nodeList = W3CDom.selectXpath("//body", doc);
        List<Node> nodes = W3CDom.sourceNodes(nodeList, Node.class);
        assertEquals(1, nodes.size());
    }

}