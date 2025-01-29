package org.jsoup.nodes;

public class GeneratedTestCreateFromEncoded {

    @Test
    public void testCreateFromEncoded() {
        String encodedText = "Hello";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("Hello", textNode.text());
    }

}