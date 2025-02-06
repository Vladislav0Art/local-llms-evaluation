package org.jsoup.nodes;

public class GeneratedIsBlank_BasicTest {

    @Test
    public void isBlank_BasicTest() {
        TextNode textNode = new TextNode("   ");
        assertTrue(textNode.isBlank());
        assertFalse(new TextNode("").isBlank());
    }

}