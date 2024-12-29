package org.jsoup.nodes;

public class GeneratedTestFromEncoded {

    @Test
    public void testFromEncoded() {
        String encodedText = "test";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("test", textNode.text());
    }

}