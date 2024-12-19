package org.jsoup.nodes;

public class GeneratedSplitText_noOffset {

    private LeafNode parentNode = null;
    private LeafNode currentSibling = null;

    @Test
    public void splitText_noOffset() {
        // Test splitting a text node into two nodes without an offset.
        String text = "Hello World!";
        assertEquals(6, currentSibling.text().length());
    }

}