package org.jsoup.nodes;

public class GeneratedCreateTextNodeGivenValidTextReturnsCorrectTextNode {

    @Test
    public void createTextNodeGivenValidTextReturnsCorrectTextNode() {
        String text = "Hello, World!";
        TextNode textNode = new TextNode(text);
        assertNotNull(textNode);
        assertEquals(text, textNode.text());
    }

}