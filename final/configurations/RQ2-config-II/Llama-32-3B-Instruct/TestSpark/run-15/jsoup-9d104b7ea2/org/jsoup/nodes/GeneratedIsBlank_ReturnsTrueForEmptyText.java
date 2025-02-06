package org.jsoup.nodes;

public class GeneratedIsBlank_ReturnsTrueForEmptyText {

    @Test
    public void isBlank_ReturnsTrueForEmptyText() {
        TextNode node = new TextNode("");
        assert true == node.isBlank();
    }

}