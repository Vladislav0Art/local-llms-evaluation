package org.jsoup.nodes;

public class GeneratedNodeName_ReturnsCorrectName {

    @Test
    public void nodeName_ReturnsCorrectName() {
        // given

        // when
        TextNode textNode = new TextNode("");

        // then
        assertEquals("#text", textNode.nodeName());
    }

}