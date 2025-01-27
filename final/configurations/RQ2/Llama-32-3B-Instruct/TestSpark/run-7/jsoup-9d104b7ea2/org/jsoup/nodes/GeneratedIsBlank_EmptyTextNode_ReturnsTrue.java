package org.jsoup.nodes;

public class GeneratedIsBlank_EmptyTextNode_ReturnsTrue {

    @Test
    public void isBlank_EmptyTextNode_ReturnsTrue() {
        boolean expected = true;
        TextNode actual = new TextNode("");
        assertEquals(expected, actual.isBlank());
    }

}