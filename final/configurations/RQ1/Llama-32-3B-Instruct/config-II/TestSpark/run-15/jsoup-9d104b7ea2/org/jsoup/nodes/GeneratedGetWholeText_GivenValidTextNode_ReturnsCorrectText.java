package org.jsoup.nodes;

public class GeneratedGetWholeText_GivenValidTextNode_ReturnsCorrectText {

    @Test
    public void getWholeText_GivenValidTextNode_ReturnsCorrectText() {
        // given
        String text = "Hello World";

        // when
        TextNode textNode = new TextNode(text);
        String wholeText = textNode.getWholeText();

        // then
        assertEquals(text, wholeText);
    }

}