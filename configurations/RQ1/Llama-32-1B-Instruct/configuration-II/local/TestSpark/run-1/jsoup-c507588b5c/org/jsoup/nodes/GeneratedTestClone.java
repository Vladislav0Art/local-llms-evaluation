package org.jsoup.nodes;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        String text = "Hello World";
        TextNode node = TextNode.text(text);

        // Create a new clone to verify the original is not changed.
        TextNode clonedNode = (TextNode) node.clone();

        assertEquals(node, clonedNode);
    }

}