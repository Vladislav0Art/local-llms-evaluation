package org.jsoup.nodes;

public class GeneratedIsBlank_returnsFalse_whenStringIsNotBlank {

    private TextNode textNode;

    @Test
    public void isBlank_returnsFalse_whenStringIsNotBlank() {
        textNode = new TextNode("not blank");
        assertFalse(textNode.isBlank());
    }

}