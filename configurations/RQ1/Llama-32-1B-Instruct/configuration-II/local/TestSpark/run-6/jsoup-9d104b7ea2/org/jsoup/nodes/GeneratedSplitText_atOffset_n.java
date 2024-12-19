package org.jsoup.nodes;

public class GeneratedSplitText_atOffset_n {

    private LeafNode parentNode = null;
    private LeafNode currentSibling = null;

    @Test
    public void splitText_atOffset_n() {
        // Test splitting a text node at an arbitrary offset.
        for (int i = 0; i < 10; i++) {
            TextNode newNode = TextNode.splitText(i);
            assert !new Node(newSource, newNode, null).text().isEmpty();
        }
    }

}