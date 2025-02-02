package org.jsoup.nodes;

public class GeneratedText_method_returnsNormalisedWhitespace {

    @Test
    public void text_method_returnsNormalisedWhitespace() {
        String text = "   Hello World  ";
        TextNode textNode = new TextNode(text);
        assertEquals(StringUtil.normaliseWhitespace(text), textNode.text());
    }

}