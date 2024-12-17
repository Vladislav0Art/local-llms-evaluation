package org.jsoup.nodes;

public class GeneratedTestLeadingWhitespace {

    @Test
    public void testLeadingWhitespace() {
        TextNode textNode = new TextNode("   Hello World  ");
        assertFalse(textNode.isBlank());
    }

}