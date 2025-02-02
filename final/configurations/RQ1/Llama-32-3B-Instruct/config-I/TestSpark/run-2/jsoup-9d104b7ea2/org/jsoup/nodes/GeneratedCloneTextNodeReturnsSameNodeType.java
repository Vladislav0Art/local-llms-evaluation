package org.jsoup.nodes;

public class GeneratedCloneTextNodeReturnsSameNodeType {

    @Test
    public void cloneTextNodeReturnsSameNodeType() {
        String originalText = "Hello World";
        TextNode textNode = new TextNode(originalText);
        TextNode clonedTextNode = textNode.clone();
        assertEquals(TextNode.class, clonedTextNode.getClass());
        assertEquals(originalText, clonedTextNode.text());
    }

}