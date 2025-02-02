package org.jsoup.nodes;

public class GeneratedTestBlankText {

    @Test
    public void testBlankText() {
        TextNode node = new TextNode("   \n\t\r\n");
        assertTrue(node.isBlank());
    }

}