package org.jsoup.nodes;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("Hello world!");
        TextNode splittedTextNode = textNode.splitText(6);
        assertEquals("Hello ", textNode.getWholeText());
        assertEquals("world!", splittedTextNode.getWholeText());
    }

}