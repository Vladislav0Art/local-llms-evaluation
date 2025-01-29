package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

public class GeneratedTestRoot {

    @Test
    public void testRoot() {
        NodeList nodeList = new NodeList();

        // Test that the root element returns itself
        NodeList rootNode = nodeList.root();
        assert rootNode == nodeList;

        // Test that the root can be traversed without changing it
        nodeList.traverse(nodeList);
        assert rootNode.equals(nodeList);
    }

}