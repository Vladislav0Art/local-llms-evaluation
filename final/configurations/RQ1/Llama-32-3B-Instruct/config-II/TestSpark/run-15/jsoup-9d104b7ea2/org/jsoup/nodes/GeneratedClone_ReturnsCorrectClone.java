package org.jsoup.nodes;

public class GeneratedClone_ReturnsCorrectClone {

    @Test
    public void clone_ReturnsCorrectClone() {
        // given

        // when
        TextNode textNode = new TextNode("Hello World");
        TextNode clonedTextNode = textNode.clone();

        // then
        assertEquals(textNode, clonedTextNode);
    }

}