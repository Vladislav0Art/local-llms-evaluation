package org.jsoup.nodes;

public class GeneratedTestRemoveNewlines {

    @Test
    public void testRemoveNewlines() {
        String text = "Hello World!\n";
        TextNode node = new TextNode(text);
        assertEquals("", node.text(""));
    }

}