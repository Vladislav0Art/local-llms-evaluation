package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

public class GeneratedSourceNodes_ReturnsList {

    @Test
    public void sourceNodes_ReturnsList() {
        NodeList nodeList = new NodeList();
        List<Node> result = W3CDom.sourceNodes(nodeList, Node.class);
        assertNotNull(result);
    }

}