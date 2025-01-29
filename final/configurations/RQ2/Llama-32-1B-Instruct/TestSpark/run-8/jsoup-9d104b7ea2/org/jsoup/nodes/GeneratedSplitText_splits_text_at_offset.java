package org.jsoup.nodes;

public class GeneratedSplitText_splits_text_at_offset {

    @Test
    public void splitText_splits_text_at_offset() throws IOException {
        TextNode node = new TextNode("Hello World");
        String expected = "Hello\nWorld";
        assertEquals(expected, node.splitText(5));
    }

}