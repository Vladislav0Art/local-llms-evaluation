package org.jsoup.nodes;

public class GeneratedClone_ReturnsCorrectTextNode {

    @Test
    public void clone_ReturnsCorrectTextNode() {
        String text = "text";
        TextNode textNode = new TextNode(text);
        TextNode clonedTextNode = (TextNode) textNode.clone();
        assertEquals(text, clonedTextNode.getWholeText());
    }

}