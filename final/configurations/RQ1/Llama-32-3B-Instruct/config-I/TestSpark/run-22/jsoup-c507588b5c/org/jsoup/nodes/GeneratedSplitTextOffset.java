package org.jsoup.nodes;

public class GeneratedSplitTextOffset {

    public TextNode testTextNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void splitTextOffset() throws IOException {
        TextNode textNode = testTextNode("Hello World!");
        int offset = 6;
        TextNode tailNode = textNode.splitText(offset);
        assertEquals(7, tailNode.text().length());
    }

}