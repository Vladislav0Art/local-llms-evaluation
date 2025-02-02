package org.jsoup.nodes;

public class GeneratedText_SplittingTextNode_HalfwayThrough_GivesCorrectText {

    @Test
    public void text_SplittingTextNode_HalfwayThrough_GivesCorrectText() {
        String text = "Hello World";
        int offset = 6;
        TextNode textNode = new TextNode(text);
        TextNode tailNode = textNode.splitText(offset);
        assertEquals(5, tailNode.text().length());
    }

}