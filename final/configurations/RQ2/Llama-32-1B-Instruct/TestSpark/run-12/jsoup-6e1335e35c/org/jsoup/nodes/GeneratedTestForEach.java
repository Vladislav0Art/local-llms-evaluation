package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

public class GeneratedTestForEach {

    @Test
    public void testForEach() {
        NodeList nodeList = new NodeList();

        // Test that the forEach method returns an empty list for empty elements
        Objects[] result = nodeList.forEach(null);
        assert Arrays.deepEquals(result, new Objects[0]);

        // Test that the original element is returned when no action is given
        result = nodeList.forEach(node -> null);
        assert Arrays.equals(result, new Object[]{nodeList});
    }

}