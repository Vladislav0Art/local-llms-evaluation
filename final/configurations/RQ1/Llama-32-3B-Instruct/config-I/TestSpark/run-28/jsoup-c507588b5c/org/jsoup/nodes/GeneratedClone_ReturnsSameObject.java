package org.jsoup.nodes;

public class GeneratedClone_ReturnsSameObject {

    @Test
    public void clone_ReturnsSameObject() {
        String rawText = "Hello World!";
        TextNode textNode = new TextNode(rawText);
        TextNode clonedTextNode = textNode.clone();
        assertEquals(textNode, clonedTextNode);
    }

}