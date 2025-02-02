package org.jsoup.nodes;

public class GeneratedIsBlankReturnsTrueWhenEmpty {

    @Test
    public void isBlankReturnsTrueWhenEmpty() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

}