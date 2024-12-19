package org.jsoup.nodes;

public class GeneratedSplitText_withTrim {

    private LeafNode parentNode = null;
    private LeafNode currentSibling = null;

    @Test
    public void splitText_withTrim() {
        // Test that a new node is created with the text after the offset and trimmed.
        String text = "Hello World!";
        LeafNode parent = new Node(newSource, TextNode.createFromEncoded(text), null);
        LeafNode newNode = TextNode.splitText(2).trim();
        assert !new Node(parent, newNode, null).text().isEmpty();
    }

}