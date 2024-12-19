package org.jsoup.nodes;

public class GeneratedTestEntityEscaping {

    @Test
    public void testEntityEscaping() {
        TextNode node = new TextNode("Hello & World!");
        String escapedText = node.toString();
        assertNotNull(escapedText);
        assertTrue(!escapedText.startsWith("&"));
    }

}