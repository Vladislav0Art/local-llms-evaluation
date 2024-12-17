package org.jsoup.nodes;

public class GeneratedCloneReturnsClone {

    @Test
    public void cloneReturnsClone() {
        // given
        TextNode textNode = new TextNode("Hello World");

        // when
        TextNode clone = textNode.clone();

        // then
        assertEquals(textNode, clone);
    }

}