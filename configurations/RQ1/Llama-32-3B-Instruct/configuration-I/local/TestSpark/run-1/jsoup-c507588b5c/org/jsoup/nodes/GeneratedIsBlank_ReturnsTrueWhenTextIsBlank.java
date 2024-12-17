package org.jsoup.nodes;

public class GeneratedIsBlank_ReturnsTrueWhenTextIsBlank {

    @Test
    public void IsBlank_ReturnsTrueWhenTextIsBlank() {
        String rawText = "";
        TextNode textNode = new TextNode(rawText);
        assertTrue(textNode.isBlank());
    }

}