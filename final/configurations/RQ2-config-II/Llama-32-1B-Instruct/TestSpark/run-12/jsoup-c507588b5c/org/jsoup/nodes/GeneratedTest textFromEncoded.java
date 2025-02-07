package org.jsoup.nodes;

public class GeneratedTest textFromEncoded {

    @Test
    public void test

    textFromEncoded() {
        String encodedText = "Hello World";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertEquals("Hello World", node.text());
    }

}