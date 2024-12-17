package org.jsoup.nodes;

public class GeneratedTestSplitText {

    private LeafNode document;
    private String text;

    @Test
    public void testSplitText() {
        text = "hello world";
        document = new TextNode(text);
        TextNode result = document.splitText(7);
        assertEquals("hello", result.text());
        assertEquals("world", document.getText().substring(8));
    }

}