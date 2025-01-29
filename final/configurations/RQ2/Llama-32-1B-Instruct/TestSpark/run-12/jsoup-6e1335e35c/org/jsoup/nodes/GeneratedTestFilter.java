package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

public class GeneratedTestFilter {

    @Test
    public void testFilter() {
        NodeList nodeList = new NodeList();

        // Test that the filter method returns an empty list for no match
        Objects[] result = nodeList.filter(null);
        assert Arrays.deepEquals(result, new Object[0]);

        // Test that the original element is returned when a match is found
        result = nodeList.filter(node -> "test".equals(node.getValue()));
        assert Arrays.equals(result, new Object[]{nodeList});
    }

}