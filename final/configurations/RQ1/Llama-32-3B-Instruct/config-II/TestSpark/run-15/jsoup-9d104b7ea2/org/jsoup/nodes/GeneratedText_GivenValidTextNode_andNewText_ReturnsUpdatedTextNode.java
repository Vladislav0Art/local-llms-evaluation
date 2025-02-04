package org.jsoup.nodes;

public class GeneratedText_GivenValidTextNode_andNewText_ReturnsUpdatedTextNode {

    @Test
    public void text_GivenValidTextNode_andNewText_ReturnsUpdatedTextNode() {
        // given
        String text = "Hello World";

        // when
        TextNode textNode = new TextNode(text);
        TextNode resultTextNode = textNode.text(" New World ");

        // then
        assertEquals("#text", resultTextNode.nodeName());
        assertEquals(" New World ", resultTextNode.text());
    }

}