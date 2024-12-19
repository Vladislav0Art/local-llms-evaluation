package org.jsoup.nodes;

public class GeneratedTestFromEncoded {

    @Test
    public void testFromEncoded() {
        String encodedText = "&lt;p&gt;Hello, World!&lt;/p&gt;";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertEquals("p", node.nodeName());
        assertTrue(node.text().isEmpty());
    }

}