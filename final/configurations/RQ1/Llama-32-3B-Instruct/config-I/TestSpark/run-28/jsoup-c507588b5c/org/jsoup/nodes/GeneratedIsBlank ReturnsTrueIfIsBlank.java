package org.jsoup.nodes;

public class GeneratedIsBlank ReturnsTrueIfIsBlank {

    @Test
    public void isBlank

    ReturnsTrueIfIsBlank() {
        String rawText = "\n   \t";
        TextNode textNode = new TextNode(rawText);
        assertTrue(textNode.isBlank());
    }

}