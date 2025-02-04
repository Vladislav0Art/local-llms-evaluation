package org.jsoup.nodes;

public class GeneratedCreateTextNode_GivenText ReturnsCorrectText {

    @Test
    public void createTextNode_GivenText

    ReturnsCorrectText() {
        // given
        String text = "Hello World";

        // when
        TextNode textNode = new TextNode(text);

        // then
        assertEquals(text, textNode.text());
    }

}