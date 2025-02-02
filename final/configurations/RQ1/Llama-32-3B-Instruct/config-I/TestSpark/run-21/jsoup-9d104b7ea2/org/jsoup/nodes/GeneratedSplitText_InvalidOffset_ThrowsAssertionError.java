package org.jsoup.nodes;

public class GeneratedSplitText_InvalidOffset_ThrowsAssertionError {

    private Document parentNode;
    private Document document;

    @Test
    public void splitText_InvalidOffset_ThrowsAssertionError() {
        parentNode = document;
        TextNode textNode = new TextNode("Hello World");
        textNode.parentNode = parentNode;
        assertThrows(AssertionError.class, () -> textNode.splitText(-1));
    }

}