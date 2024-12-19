package org.jsoup.nodes;

public class GeneratedTestGetWholeText {

    private LeafNode document;
    private String text;

    @Test
    public void testGetWholeText() {
        text = "   hello   ";
        document = new TextNode(text);
        assertEquals("hello", document.getText());
    }

}