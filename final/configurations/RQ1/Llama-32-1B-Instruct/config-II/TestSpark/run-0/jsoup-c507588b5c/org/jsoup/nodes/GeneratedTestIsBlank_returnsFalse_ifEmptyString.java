package org.jsoup.nodes;

public class GeneratedTestIsBlank_returnsFalse_ifEmptyString {

    @Test
    public void testIsBlank_returnsFalse_ifEmptyString() {
        TextNode textNode = new TextNode("");
        assertEquals(false, textNode.isBlank());
    }

}