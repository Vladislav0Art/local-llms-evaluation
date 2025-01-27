package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSelectXpathReturnsEmptyList {

    @Test
    public void selectXpathReturnsEmptyList() {
        NodeList nodeList = new ArrayList<>();
        List<Node> result = W3CDom.sourceNodes(nodeList, Node.class);
        assertTrue(result.isEmpty());
    }

}