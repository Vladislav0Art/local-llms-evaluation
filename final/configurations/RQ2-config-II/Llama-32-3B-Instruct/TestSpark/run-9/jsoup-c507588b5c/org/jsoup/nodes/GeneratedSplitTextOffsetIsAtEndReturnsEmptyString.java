package org.jsoup.nodes;

public class GeneratedSplitTextOffsetIsAtEndReturnsEmptyString {

    @Test
    public void splitTextOffsetIsAtEndReturnsEmptyString() throws IOException {
        TextNode textNode = new TextNode("Hello World");
        TextNode result = (TextNode) textNode.splitText(textNode.length());
        assertTrue(result.isBlank());
    }

}