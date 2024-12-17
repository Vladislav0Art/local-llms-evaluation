package org.jsoup.nodes;

public class GeneratedCreateTextNode_GivenEmptyString_ReturnsBlankTextNode {


    private TextNode textNode;

    @Before
    public void setupTextNode() {
        String text = "Hello World";
        this.textNode = new TextNode(text);
    }

    @Test
    public void CreateTextNode_GivenEmptyString_ReturnsBlankTextNode() {
        String text = "";
        this.textNode = new TextNode(text);
        assertTrue(this.textNode.isBlank());
    }

}