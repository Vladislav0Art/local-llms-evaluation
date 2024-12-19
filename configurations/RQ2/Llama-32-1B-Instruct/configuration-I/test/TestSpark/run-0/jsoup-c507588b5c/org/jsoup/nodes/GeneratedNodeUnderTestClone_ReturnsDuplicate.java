package org.jsoup.nodes;

public class GeneratedNodeUnderTestClone_ReturnsDuplicate {

    @Test
    public void NodeUnderTestClone_ReturnsDuplicate() throws Exception {
        NodeUnderTest node = new NodeUnderTest("Hello, World!");
        NodeUnderTest duplicateNode = new NodeUnderTest(node.getText());
        assertEquals(node, duplicateNode);
    }

}