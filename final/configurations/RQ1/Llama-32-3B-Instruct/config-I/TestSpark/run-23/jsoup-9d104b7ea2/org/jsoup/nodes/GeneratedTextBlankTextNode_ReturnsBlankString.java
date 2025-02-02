package org.jsoup.nodes;

public class GeneratedTextBlankTextNode_ReturnsBlankString {

    @Test
    public void textBlankTextNode_ReturnsBlankString() {
        String text = "";
        TextNode textNode = new TextNode(text);
        String result = textNode.text();
        assertTrue(result.isEmpty());
    }

}