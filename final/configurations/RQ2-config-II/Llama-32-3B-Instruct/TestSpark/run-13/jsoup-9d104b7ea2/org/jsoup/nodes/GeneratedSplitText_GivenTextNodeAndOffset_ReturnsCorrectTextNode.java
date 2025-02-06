package org.jsoup.nodes;

public class GeneratedSplitText_GivenTextNodeAndOffset_ReturnsCorrectTextNode {

    @Test
    public void splitText_GivenTextNodeAndOffset_ReturnsCorrectTextNode() throws IOException {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        TextNode result = textNode.splitText(0);
        assertNotNull(result.text());
    }

}