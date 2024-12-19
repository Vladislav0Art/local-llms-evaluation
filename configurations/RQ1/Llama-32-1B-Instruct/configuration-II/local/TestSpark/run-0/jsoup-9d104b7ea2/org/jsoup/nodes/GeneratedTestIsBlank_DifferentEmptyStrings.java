package org.jsoup.nodes;

public class GeneratedTestIsBlank_DifferentEmptyStrings {

    @Test
    public void testIsBlank_DifferentEmptyStrings() {
        assertEquals(true, TextNode.isBlank("  "));
        assertEquals(true, TextNode.isBlank("\t "));
        assertEquals(false, TextNode.isBlank("hello"));
    }

}