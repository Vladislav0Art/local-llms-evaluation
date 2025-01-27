package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class GeneratedSourceNodes_EmptyList_ReturnsEmptyList {

    @Test
    public void sourceNodes_EmptyList_ReturnsEmptyList() {
        NodeList nodeList = new ArrayList<>();
        List<Node> result = W3CDom.sourceNodes(nodeList, Node.class);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

}