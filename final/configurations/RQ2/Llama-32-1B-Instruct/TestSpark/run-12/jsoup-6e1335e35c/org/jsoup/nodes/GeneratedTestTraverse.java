package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

public class GeneratedTestTraverse {

    @Test
    public void testTraverse() {
        NodeList nodeList = new NodeList();

        // Test that the traverse method returns an empty list
        Object[] result = nodeList.traverse(null);
        assert Arrays.deepEquals(result, new Object[0]);

        // Test that the original element is returned when no action is given
        result = nodeList.traverse(nodeList);
        assert Arrays.equals(result, new Object[]{nodeList});
    }

}