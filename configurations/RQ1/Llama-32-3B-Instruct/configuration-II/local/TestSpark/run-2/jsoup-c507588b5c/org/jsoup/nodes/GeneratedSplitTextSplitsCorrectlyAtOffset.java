package org.jsoup.nodes;

public class GeneratedSplitTextSplitsCorrectlyAtOffset {

    private TextNode textNode;

    @Test
    public void splitTextSplitsCorrectlyAtOffset() throws IOException {
        String originalText = "Hello World";
        textNode = new TextNode(originalText);

        int offset = 6;
        TextNode expectedHead = new TextNode("Hello ");
        TextNode expectedTail = new TextNode(originalText.substring(offset));
        assertEquals(expectedHead, textNode.splitText(offset));

        assertEquals(expectedTail, textNode.nextSibling());
    }

}