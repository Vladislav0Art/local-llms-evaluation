package org.jsoup.nodes;

public class GeneratedIsBlank_ReturnsTrueIfTextContentIsWhitespaceOnly {

    @Test
    public void isBlank_ReturnsTrueIfTextContentIsWhitespaceOnly() {
        String text = "   ";
        TextNode textNode = new TextNode(text);
        assertTrue(textNode.isBlank());
    }

}