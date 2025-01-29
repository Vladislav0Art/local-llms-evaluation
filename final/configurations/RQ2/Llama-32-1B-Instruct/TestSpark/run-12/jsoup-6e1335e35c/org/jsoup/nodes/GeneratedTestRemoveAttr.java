package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

public class GeneratedTestRemoveAttr {

    @Test
    public void testRemoveAttr() {
        NodeList nodeList = new NodeList();
        nodeList.removeAttr("test");

        // Assert that the attribute is removed
        assert nodeList.getAttributes().get(0).getValue() == null;
    }

}