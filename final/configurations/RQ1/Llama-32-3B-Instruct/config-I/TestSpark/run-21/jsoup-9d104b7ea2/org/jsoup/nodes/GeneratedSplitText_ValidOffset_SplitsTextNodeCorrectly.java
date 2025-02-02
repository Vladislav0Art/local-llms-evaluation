package org.jsoup.nodes;

public class GeneratedSplitText_ValidOffset_SplitsTextNodeCorrectly {

    private Document parentNode;
    private Document document;

    @Test
    public void splitText_ValidOffset_SplitsTextNodeCorrectly() {
        parentNode = document;
        TextNode textNode = new TextNode("Hello World");
        textNode.parentNode = parentNode;
        TextNode tailNode = textNode.splitText(7);
        assertEquals("Hello ", textNode.text());
        assertNotNull(tailNode);
        assertEquals("World", tailNode.text());
    }

}