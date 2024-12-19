package org.jsoup.nodes;

public class GeneratedIsBlankReturnsTrueIfEmptyOrWhitespace {

    @Test
    public void isBlankReturnsTrueIfEmptyOrWhitespace() {
        TextNode node1 = new TextNode("");
        assertTrue(node1.isBlank());

        TextNode node2 = new TextNode("\t");
        assertTrue(node2.isBlank());

        TextNode node3 = new TextNode("   ");
        assertTrue(node3.isBlank());
    }

}