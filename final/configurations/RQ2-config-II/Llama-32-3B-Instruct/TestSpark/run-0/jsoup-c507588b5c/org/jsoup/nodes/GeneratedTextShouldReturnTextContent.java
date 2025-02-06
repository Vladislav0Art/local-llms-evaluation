package org.jsoup.nodes;

public class GeneratedTextShouldReturnTextContent {

    @Test
    public void textShouldReturnTextContent() {
        TextNode textNode = new TextNode("Hello World");
        String text = textNode.text();
        assertNotNull(text);
        assertEquals("Hello World", text);
    }

}