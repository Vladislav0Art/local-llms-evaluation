package org.jsoup.nodes;

public class GeneratedSplitTextOffsetIsZeroReturnsCorrectText {

    @Test
    public void splitTextOffsetIsZeroReturnsCorrectText() throws IOException {
        TextNode textNode = new TextNode("Hello World");
        TextNode result = (TextNode) textNode.splitText(0);
        assertEquals("Hello ", result.text());
    }

}