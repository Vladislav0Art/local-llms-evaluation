package org.jsoup.nodes;

public class GeneratedSplitText_GivenValidTextNode_andOffset_ReturnsCorrectTextNode {

    @Test
    public void splitText_GivenValidTextNode_andOffset_ReturnsCorrectTextNode() {
        // given
        String text = "Hello World";
        int offset = 7;

        // when
        TextNode textNode = new TextNode(text);
        TextNode resultTextNode = textNode.splitText(offset);

        // then
        assertEquals("Hello", resultTextNode.text());
    }

}