package org.jsoup.nodes;

public class GeneratedTextShouldSplitTextNodeIntoTwoNodes {

    @Test
    public void textShouldSplitTextNodeIntoTwoNodes() {
        String text = "Hello\nWorld";
        TextNode textNode = new TextNode(text);
        TextNode firstChild = ((TextNode) textNode).splitText(0);
        assertNotNull(firstChild.text());
        assertEquals("Hello", firstChild.text());
        assertNotNull(((TextNode) textNode).splitText(text.length()));
    }

}