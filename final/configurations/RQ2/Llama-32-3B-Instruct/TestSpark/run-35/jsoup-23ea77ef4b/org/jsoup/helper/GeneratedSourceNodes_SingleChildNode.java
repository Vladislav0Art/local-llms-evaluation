package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayOutputStream;
import java.util.Map;

public class GeneratedSourceNodes_SingleChildNode {

    @Test
    public void sourceNodes_SingleChildNode() {
        NodeList nodeList = new org.jsoup.nodes.Document().getElementsByTagName("child").toArray(new org.jsoup.nodes.Node[0]);
        List<Node> result = W3CDom.sourceNodes(nodeList, Node.class);
        assertEquals(1, result.size());
    }

}