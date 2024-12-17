package org.jsoup.nodes;

public class GeneratedTestText {

    private LeafNode document;
    private String text;

    @Test
    public void testText() {
        text = "   hello   ";
        document = new TextNode(text);
        assertEquals("hello ", document.text());
    }

}