package org.jsoup.nodes;

public class GeneratedSplitText_atOffset1 {

    private LeafNode parentNode = null;
    private LeafNode currentSibling = null;

    @Test
    public void splitText_atOffset1() {
        // Test splitting a text node at the second character (offset 1).
        String text = "Hello World!";
        assertEquals("World", currentSibling.text());
    }

}