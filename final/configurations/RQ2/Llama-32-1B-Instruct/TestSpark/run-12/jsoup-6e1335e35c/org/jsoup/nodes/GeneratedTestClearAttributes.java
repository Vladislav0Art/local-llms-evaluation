package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

public class GeneratedTestClearAttributes {

    @Test
    public void testClearAttributes() {
        NodeList nodeList = new NodeList();
        nodeList.clearAttributes();

        // Assert that the attributes are cleared
        assert nodeList.getAttributes().isEmpty();
    }

}