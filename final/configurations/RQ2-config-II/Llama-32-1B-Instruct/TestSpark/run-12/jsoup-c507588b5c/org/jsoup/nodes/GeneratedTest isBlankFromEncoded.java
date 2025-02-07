package org.jsoup.nodes;

public class GeneratedTest isBlankFromEncoded {

    @Test
    public void test

    isBlankFromEncoded() {
        String encodedText = "Hello World";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertTrue(node.isBlankFromEncoded());
    }

}