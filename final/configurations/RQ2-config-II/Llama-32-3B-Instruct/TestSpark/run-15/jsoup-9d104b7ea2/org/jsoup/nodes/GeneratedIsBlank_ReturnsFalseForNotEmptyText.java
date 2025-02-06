package org.jsoup.nodes;

public class GeneratedIsBlank_ReturnsFalseForNotEmptyText {

    @Test
    public void isBlank_ReturnsFalseForNotEmptyText() {
        TextNode node = new TextNode("test");
        assert false == node.isBlank();
    }

}