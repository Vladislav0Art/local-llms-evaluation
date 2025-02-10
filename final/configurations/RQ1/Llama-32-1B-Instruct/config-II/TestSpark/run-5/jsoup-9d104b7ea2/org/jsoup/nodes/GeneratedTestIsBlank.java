package org.jsoup.nodes;

public class GeneratedTestIsBlank {

    private static final String TEST_TEXT = "<p>Hello World!</p>";

    @Test
    public void testIsBlank() {
        TextNode node = new TextNode(TEST_TEXT);
        assertTrue(node.isBlank());
    }

}