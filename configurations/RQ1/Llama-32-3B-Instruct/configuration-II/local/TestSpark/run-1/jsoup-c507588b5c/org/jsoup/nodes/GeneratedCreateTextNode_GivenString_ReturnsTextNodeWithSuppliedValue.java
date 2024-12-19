package org.jsoup.nodes;

public class GeneratedCreateTextNode_GivenString_ReturnsTextNodeWithSuppliedValue {

    @Test
    public void createTextNode_GivenString_ReturnsTextNodeWithSuppliedValue() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.text());
    }

}