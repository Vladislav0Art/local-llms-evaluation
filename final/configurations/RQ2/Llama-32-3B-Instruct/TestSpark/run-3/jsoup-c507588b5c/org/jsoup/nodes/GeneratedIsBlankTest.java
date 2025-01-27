package org.jsoup.nodes;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        TextNode node1 = new TextNode("   ");
        assertTrue(node1.isBlank());
        assertFalse(new TextNode("").isBlank());
    }

}