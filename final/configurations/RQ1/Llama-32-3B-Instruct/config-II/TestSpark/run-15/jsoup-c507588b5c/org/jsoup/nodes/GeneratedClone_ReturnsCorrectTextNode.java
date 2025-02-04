package org.jsoup.nodes;

public class GeneratedClone_ReturnsCorrectTextNode {

    @Test
    public void clone_ReturnsCorrectTextNode() {
        // given
        TextNode textNode = new TextNode("Hello World");

        // when
        TextNode clonedTextNode = textNode.clone();

        // then
        assertEquals("Hello World", clonedTextNode.text());
    }

}