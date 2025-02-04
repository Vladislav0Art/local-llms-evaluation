package org.jsoup.nodes;

public class GeneratedIsBlank_ReturnsTrueIfTextIsBlank {

    @Test
    public void isBlank_ReturnsTrueIfTextIsBlank() {
        // given
        TextNode textNode1 = new TextNode("   ");
        TextNode textNode2 = new TextNode("   ");

        // when
        boolean isBlank1 = textNode1.isBlank();
        boolean isBlank2 = textNode2.isBlank();

        // then
        assertTrue(isBlank1);
        assertTrue(isBlank2);
    }

}