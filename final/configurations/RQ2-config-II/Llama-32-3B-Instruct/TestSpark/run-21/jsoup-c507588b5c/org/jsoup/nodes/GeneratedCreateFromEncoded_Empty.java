package org.jsoup.nodes;

public class GeneratedCreateFromEncoded_Empty {

    @Test
    public void createFromEncoded_Empty() {
        String encodedText = "";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertEquals("", node.text());
        assertFalse(node.isBlank());
    }

}