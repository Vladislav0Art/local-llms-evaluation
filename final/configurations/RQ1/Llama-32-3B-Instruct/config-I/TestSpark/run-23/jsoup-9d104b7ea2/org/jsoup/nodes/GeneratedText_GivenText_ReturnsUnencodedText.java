package org.jsoup.nodes;

public class GeneratedText_GivenText_ReturnsUnencodedText {

    @Test
    public void text_GivenText_ReturnsUnencodedText() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        String result = textNode.text();
        assertNotNull(result);
        assertEquals(text, result);
    }

}