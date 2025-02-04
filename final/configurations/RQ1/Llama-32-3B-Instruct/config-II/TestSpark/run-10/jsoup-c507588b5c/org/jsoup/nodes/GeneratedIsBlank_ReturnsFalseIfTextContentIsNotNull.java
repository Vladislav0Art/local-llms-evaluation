package org.jsoup.nodes;

public class GeneratedIsBlank_ReturnsFalseIfTextContentIsNotNull {

    @Test
    public void isBlank_ReturnsFalseIfTextContentIsNotNull() {
        String text = "text";
        TextNode textNode = new TextNode(text);
        assertFalse(textNode.isBlank());
    }

}