package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class GeneratedSourceNodes_NullList_ReturnsEmptyList {

    @Test
    public void sourceNodes_NullList_ReturnsEmptyList() {
        List<Node> nodeList = new ArrayList<>();
        NodeList result = W3CDom.sourceNodes(null, Node.class);
        assertNotNull(result);
        assertTrue(nodeList.size() == 0);
    }

}