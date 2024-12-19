package org.jsoup.nodes;

public class GeneratedSplitText_atOffset0 {

    private LeafNode parentNode = null;
    private LeafNode currentSibling = null;

    @Test
    public void splitText_atOffset0() {
        // Test splitting a text node at the first character (offset 0).
        assert TextNode.splitText(0).text().isEmpty();
    }

}