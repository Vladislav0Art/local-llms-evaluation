package org.jsoup.nodes;

public class GeneratedSetTextNodeGivenText_updatesTextContent {

    @Test
    public void setTextNodeGivenText_updatesTextContent() {
        String originalText = "Hello World";
        TextNode textNode = new TextNode(originalText);
        String updatedText = "Hello Universe";
        textNode.text(updatedText);
        assertEquals(updatedText, textNode.text());
    }

}