package org.jsoup.nodes;

public class GeneratedSplitText {

    private LeafNode parentNode = null;
    private LeafNode currentSibling = null;

    @Test
    public void splitText() {
        // Test splitting a text node into two nodes at the specified string offset.
        String text = "Hello World!";
        assertEquals(6, currentSibling.text().length());
        TextNode newNode = TextNode.splitText(2);
        assert new Node(newSource, newNode, null).text().isEmpty();
    }

}