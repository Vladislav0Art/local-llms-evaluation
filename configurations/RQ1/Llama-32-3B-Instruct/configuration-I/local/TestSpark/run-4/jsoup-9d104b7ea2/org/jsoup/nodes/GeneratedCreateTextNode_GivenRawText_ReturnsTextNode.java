package org.jsoup.nodes;

public class GeneratedCreateTextNode_GivenRawText_ReturnsTextNode {


    private TextNode textNode;

    @Before
    public void setupTextNode() {
        String text = "Hello World";
        this.textNode = new TextNode(text);
    }

    @Test
    public void CreateTextNode_GivenRawText_ReturnsTextNode() {
        assertEquals("#text", textNode.nodeName());
        assertEquals(textNode.value(), textNode.text());
    }

}