package org.jsoup.nodes;

public class GeneratedTestNodeName_TextNodeNameEqualsToText {

    @Test
    public void testNodeName_TextNodeNameEqualsToText() {
        TextNode textNode = new TextNode("Hello");
        assertEquals(nodeName(textNode), "#text");
    }

    public String text(TextNode textNode) throws IOException {
        return textNode.value;
    }

}