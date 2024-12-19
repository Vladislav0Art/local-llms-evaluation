package org.jsoup.nodes;

public class GeneratedSplitText_withNewNode {

    private LeafNode parentNode = null;
    private LeafNode currentSibling = null;

    @Test
    public void splitText_withNewNode() {
        // Test that a new node is created with the text after the offset.
        String text = "Hello World!";
        LeafNode newNode = TextNode.splitText(6);
        assert !new Node(newSource, newNode, null).text().isEmpty();
    }

}