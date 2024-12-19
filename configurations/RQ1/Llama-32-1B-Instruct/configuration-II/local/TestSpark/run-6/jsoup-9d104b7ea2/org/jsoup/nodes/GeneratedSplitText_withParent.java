package org.jsoup.nodes;

public class GeneratedSplitText_withParent {

    private LeafNode parentNode = null;
    private LeafNode currentSibling = null;

    @Test
    public void splitText_withParent() {
        // Test that a new node is created with the text after the offset if it's within a block.
        String text = "<p>Hello World!</p>";
        LeafNode parent = new Node(newSource, TextNode.createFromEncoded(text), null);
        LeafNode newNode = TextNode.splitText(5);
        assert !new Node(parent, newNode, null).text().isEmpty();
    }

}