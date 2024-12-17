package org.jsoup.nodes;

public class GeneratedTestIsBlank {

    private LeafNode document;
    private String text;

    @Test
    public void testIsBlank() {
        document = new TextNode("");
        assertTrue(document.isBlank());
    }

}