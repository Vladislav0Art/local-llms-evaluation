package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.ParserConfigurationException;

public class GeneratedSourceNodesNodeListClassReturnsList {

    @Test
    public void sourceNodesNodeListClassReturnsList() {
        NodeList nodeList = new ArrayList<>();
        List<String> result = W3CDom.sourceNodes(nodeList, String.class);
        assertTrue(result instanceof ArrayList);
    }

}