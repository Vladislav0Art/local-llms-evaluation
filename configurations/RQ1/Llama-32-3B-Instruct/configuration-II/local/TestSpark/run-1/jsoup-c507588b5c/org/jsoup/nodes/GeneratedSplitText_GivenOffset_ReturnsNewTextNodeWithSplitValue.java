package org.jsoup.nodes;

public class GeneratedSplitText_GivenOffset_ReturnsNewTextNodeWithSplitValue {

    @Test
    public void splitText_GivenOffset_ReturnsNewTextNodeWithSplitValue() throws IOException {
        String originalText = "Hello World";
        TextNode textNode = new TextNode(originalText);
        int offset = 5;
        TextNode newTextNode = textNode.splitText(offset);
        assertEquals("Hello", newTextNode.text());
    }

}