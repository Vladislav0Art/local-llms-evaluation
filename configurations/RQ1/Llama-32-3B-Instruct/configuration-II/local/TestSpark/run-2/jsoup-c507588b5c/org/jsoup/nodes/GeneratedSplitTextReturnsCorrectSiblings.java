package org.jsoup.nodes;

public class GeneratedSplitTextReturnsCorrectSiblings {

    private TextNode textNode;

    @Test
    public void splitTextReturnsCorrectSiblings() throws IOException {
        String originalText = "Hello World";
        textNode = new TextNode(originalText);

        int offset = 6;
        TextNode expectedHead = new TextNode("Hello ");
        TextNode expectedTail = new TextNode(originalText.substring(offset));
        assertEquals(expectedHead, textNode.splitText(offset).getParent().getChildren(0));

        assertEquals(expectedTail, textNode.splitText(offset).getNextSibling());
    }

}