package org.jsoup.nodes;

public class GeneratedTestLastCharIsWhitespace {

    @Test
    public void testLastCharIsWhitespace() {
        String builder = new StringBuilder();
        builder.append('X');
        TextNode textNode = new MockTextNode();
        textNode.text(builder.toString());
        assertTrue(lastCharIsWhitespace(builder.toString()));
    }

}