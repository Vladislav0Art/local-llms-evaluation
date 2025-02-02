package org.jsoup.nodes;

public class GeneratedTextNormalisesWhitespace {

    @Test
    public void textNormalisesWhitespace() {
        String text = "   Hello   World";
        TextNode node = new TextNode(text);
        assertEquals("Hello World", node.text());
    }

}