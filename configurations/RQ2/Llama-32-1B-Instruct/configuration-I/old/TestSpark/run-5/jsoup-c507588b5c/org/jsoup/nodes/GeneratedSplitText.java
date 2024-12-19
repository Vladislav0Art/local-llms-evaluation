package org.jsoup.nodes;

public class GeneratedSplitText {

    @Test
    public void splitText() {
        TextNode node1 = new TextNode("\n\nHello\nWorld");
        TextNode node2 = node1.splitText(10);
        assertNotNull(node2);
        assertEquals("  World", node2.text().trim());
    }

}