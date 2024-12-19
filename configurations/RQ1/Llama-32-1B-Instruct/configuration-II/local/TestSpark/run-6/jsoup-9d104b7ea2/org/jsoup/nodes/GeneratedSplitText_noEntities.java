package org.jsoup.nodes;

public class GeneratedSplitText_noEntities {

    private LeafNode parentNode = null;
    private LeafNode currentSibling = null;

    @Test
    public void splitText_noEntities() {
        // Test that the last character is not replaced by an entity.
        String text = "Hello World!";
        LeafNode parent = new Node(newSource, TextNode.createFromEncoded(text), null);
        LeafNode newNode = TextNode.splitText(2).lastCharIsWhitespace();
        assert !new Node(parent, newNode, null).text().isEmpty();
    }

}