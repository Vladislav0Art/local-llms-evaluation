package org.jsoup.nodes;

public class GeneratedTestGetWholeText {

    @Test
    public void testGetWholeText() {
        TextNode textNode = new TextNode("some text");
        String wholeText = textNode.getWholeText();
        assertEquals("some text", wholeText);
    }

}