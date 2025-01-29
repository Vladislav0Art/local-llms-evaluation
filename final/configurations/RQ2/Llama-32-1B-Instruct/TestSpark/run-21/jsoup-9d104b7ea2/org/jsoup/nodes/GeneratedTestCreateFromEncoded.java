package org.jsoup.nodes;

public class GeneratedTestCreateFromEncoded {

    @Test
    public void testCreateFromEncoded() {
        TextNode node = TextNode.createFromEncoded("Hello World");
        assertEquals("Hello World", node.text());
    }

}