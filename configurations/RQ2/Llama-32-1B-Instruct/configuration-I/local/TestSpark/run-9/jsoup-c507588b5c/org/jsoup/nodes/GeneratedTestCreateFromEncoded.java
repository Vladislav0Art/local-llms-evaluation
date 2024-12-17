package org.jsoup.nodes;

public class GeneratedTestCreateFromEncoded {

    private LeafNode document;
    private String text;

    @Test
    public void testCreateFromEncoded() {
        text = "test";
        document = TextNode.createFromEncoded(text);
        assertEquals("test", document.text());
    }

}