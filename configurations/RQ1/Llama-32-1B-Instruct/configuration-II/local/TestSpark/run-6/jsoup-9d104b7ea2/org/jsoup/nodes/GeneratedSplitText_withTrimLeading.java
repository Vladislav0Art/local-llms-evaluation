package org.jsoup.nodes;

public class GeneratedSplitText_withTrimLeading {

    private LeafNode parentNode = null;
    private LeafNode currentSibling = null;

    @Test
    public void splitText_withTrimLeading() {
        // Test that a new node is created with the text after the offset and trimmed leading.
        String text = "Hello World!";
        LeafNode parent = new Node(newSource, TextNode.createFromEncoded(text), null);
        LeafNode newNode = TextNode.splitText(2).trimLeading();
        assert !new Node(parent, newNode, null).text().isEmpty();
    }

}