package org.jsoup.nodes;

public class GeneratedTestText_ReturnsTextContent {

    @Test
    public void testText_ReturnsTextContent() throws IOException {
        String text = "Hello World!";
        TextNode textNode = new TextNode(text);
        assertEquals("Hello World!", text(textNode));
    }

    public void setText(TextNode textNode, String text) {
        textNode.value = text;
    }

}