package org.jsoup.nodes;

public class GeneratedIsBlank {

    @Test
    public void isBlank() {
        TextNode node = new TextNode("\t");
        assertTrue(node.isBlank());
    }

}