package org.jsoup.nodes;

public class GeneratedIsBlank_ReturnsTrueIfBlank {

    @Test
    public void isBlank_ReturnsTrueIfBlank() {
        // given
        TextNode textNode1 = new TextNode("");
        TextNode textNode2 = new TextNode("   ");

        // when
        boolean result1 = textNode1.isBlank();
        boolean result2 = textNode2.isBlank();

        // then
        assertTrue(result1);
        assertFalse(result2);
    }

}