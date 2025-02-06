package org.jsoup.nodes;

public class GeneratedSplitText_SplitsTextAtOffset {

    @Test
    public void splitText_SplitsTextAtOffset() {
        TextNode node = new TextNode("Hello World");
        TextNode result = node.splitText(6);
        assertNotNull(result);
        assertEquals("World", result.text());
    }

}