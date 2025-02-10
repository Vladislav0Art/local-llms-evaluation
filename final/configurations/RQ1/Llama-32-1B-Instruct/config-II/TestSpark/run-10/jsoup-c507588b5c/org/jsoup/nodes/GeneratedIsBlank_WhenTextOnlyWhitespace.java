package org.jsoup.nodes;

public class GeneratedIsBlank_WhenTextOnlyWhitespace {

    @Test
    public void isBlank_WhenTextOnlyWhitespace() {
        TextNode node = new TextNode("   ");
        assertTrue(node.isBlank());
    }

}