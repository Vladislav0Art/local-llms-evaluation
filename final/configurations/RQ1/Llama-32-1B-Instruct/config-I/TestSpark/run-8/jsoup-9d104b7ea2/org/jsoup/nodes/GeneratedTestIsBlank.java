package org.jsoup.nodes;

public class GeneratedTestIsBlank {

    @Test
    public void testIsBlank() {
        assertFalse(TextNode.class.isInstance(new TextNode("")));
        assertFalse(TextNode.class.isInstance(new TextNode(null)));
        assertTrue(TextNode.class.isInstance(new TextNode()));
    }

}