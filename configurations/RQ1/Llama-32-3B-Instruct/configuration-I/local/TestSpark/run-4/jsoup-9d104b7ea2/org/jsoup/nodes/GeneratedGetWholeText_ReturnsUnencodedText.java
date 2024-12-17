package org.jsoup.nodes;

public class GeneratedGetWholeText_ReturnsUnencodedText {


    private TextNode textNode;

    @Before
    public void setupTextNode() {
        String text = "Hello World";
        this.textNode = new TextNode(text);
    }

    @Test
    public void GetWholeText_ReturnsUnencodedText() {
        String text = "Hello World";
        this.textNode = new TextNode(text);
        assertEquals(text, this.textNode.value());
    }

}